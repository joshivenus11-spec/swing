/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;
public class SnakeGame extends JPanel implements ActionListener {
    private static final int TILE = 25;
    private static final int COLS = 28;
    private static final int ROWS = 22;
    private static final int BOARD_W = COLS * TILE;
    private static final int BOARD_H = ROWS * TILE;
    private static final int SIDE_W = 220;
    private static final int PREF_W = BOARD_W + SIDE_W;
    private static final int PREF_H = BOARD_H;

    private static final Color BG = new Color(8, 12, 24);
    private static final Color PANEL = new Color(13, 21, 39);
    private static final Color NEON_GREEN = new Color(57, 255, 136);
    private static final Color NEON_CYAN = new Color(46, 225, 255);
    private static final Color NEON_PINK = new Color(255, 70, 180);
    private static final Color TEXT = new Color(224, 239, 255);
    private static final Color MUTED = new Color(132, 156, 184);

    private enum Screen { MENU, PLAYING, PAUSED, GAME_OVER }
    private enum Direction { UP, DOWN, LEFT, RIGHT }

    private Screen screen = Screen.MENU;
    private Direction direction = Direction.RIGHT;
    private Direction nextDirection = Direction.RIGHT;
    private final java.util.List<Point> snake = new ArrayList<>();
    private final Set<Point> obstacles = new HashSet<>();
    private final Random random = new Random();
    private final javax.swing.Timer timer;
    private final javax.swing.Timer bonusTimer;

    private int score = 0;
    private int highScore = 0;
    private int foodsEaten = 0;
    private int delay = 125;
    private String difficulty = "MEDIUM";
    private Point food = new Point(10, 10);
    private Point bonusFood = null;
    private int bonusSeconds = 0;
    private boolean bonusAvailable = false;
    private boolean soundOn = true;
    private String message = "EAT • GROW • SURVIVE";
    private boolean newHighScore = false;

    private final Path scoreFile = Paths.get("highscore.txt");

    public SnakeGame() {
        setPreferredSize(new Dimension(PREF_W, PREF_H));
        setBackground(BG);
        setFocusable(true);
        highScore = loadHighScore();

        timer = new javax.swing.Timer(delay, this);
        bonusTimer = new javax.swing.Timer(1000, e -> {
            if (screen == Screen.PLAYING && bonusAvailable) {
                bonusSeconds--;
                if (bonusSeconds <= 0) {
                    bonusAvailable = false;
                    bonusFood = null;
                }
                repaint();
            }
        });
        bonusTimer.start();

        setupKeyBindings();
    }
 private void setupKeyBindings() {
        bind("UP", KeyEvent.VK_UP, () -> changeDirection(Direction.UP));
        bind("DOWN", KeyEvent.VK_DOWN, () -> changeDirection(Direction.DOWN));
        bind("LEFT", KeyEvent.VK_LEFT, () -> changeDirection(Direction.LEFT));
        bind("RIGHT", KeyEvent.VK_RIGHT, () -> changeDirection(Direction.RIGHT));
        bind("W", KeyEvent.VK_W, () -> changeDirection(Direction.UP));
        bind("S", KeyEvent.VK_S, () -> changeDirection(Direction.DOWN));
        bind("A", KeyEvent.VK_A, () -> changeDirection(Direction.LEFT));
        bind("D", KeyEvent.VK_D, () -> changeDirection(Direction.RIGHT));
        bind("SPACE", KeyEvent.VK_SPACE, this::togglePause);
        bind("ENTER", KeyEvent.VK_ENTER, () -> {
            if (screen == Screen.MENU || screen == Screen.GAME_OVER) startGame();
            else if (screen == Screen.PAUSED) togglePause();
        });
        bind("R", KeyEvent.VK_R, this::startGame);
        bind("ESC", KeyEvent.VK_ESCAPE, () -> {
            if (screen == Screen.PLAYING || screen == Screen.PAUSED) {
                timer.stop();
                screen = Screen.MENU;
                repaint();
            }
        });
        bind("DIFF_EASY", KeyEvent.VK_1, () -> setDifficulty("EASY"));
        bind("DIFF_MEDIUM", KeyEvent.VK_2, () -> setDifficulty("MEDIUM"));
        bind("DIFF_HARD", KeyEvent.VK_3, () -> setDifficulty("HARD"));
        bind("SOUND", KeyEvent.VK_M, () -> { soundOn = !soundOn; repaint(); });
    }

    private void bind(String name, int keyCode, Runnable action) {
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(keyCode, 0), name);
        getActionMap().put(name, new AbstractAction() {
            @Override public void actionPerformed(ActionEvent e) { action.run(); }
        });
    }

    private void setDifficulty(String value) {
        if (screen == Screen.MENU) {
            difficulty = value;
            repaint();
        }
    }
    private void changeDirection(Direction wanted) {
        if (screen != Screen.PLAYING) return;
        if (wanted == Direction.UP && direction != Direction.DOWN) nextDirection = wanted;
        if (wanted == Direction.DOWN && direction != Direction.UP) nextDirection = wanted;
        if (wanted == Direction.LEFT && direction != Direction.RIGHT) nextDirection = wanted;
        if (wanted == Direction.RIGHT && direction != Direction.LEFT) nextDirection = wanted;
    }

    private void togglePause() {
        if (screen == Screen.PLAYING) {
            screen = Screen.PAUSED;
            timer.stop();
        } else if (screen == Screen.PAUSED) {
            screen = Screen.PLAYING;
            timer.start();
        }
        repaint();
    }

    private void startGame() {
        score = 0;
        newHighScore = false;
        foodsEaten = 0;
        bonusAvailable = false;
        bonusFood = null;
        direction = Direction.RIGHT;
        nextDirection = Direction.RIGHT;
        snake.clear();
        obstacles.clear();

        int startX = COLS / 2;
        int startY = ROWS / 2;
        snake.add(new Point(startX, startY));
        snake.add(new Point(startX - 1, startY));
        snake.add(new Point(startX - 2, startY));
        snake.add(new Point(startX - 3, startY));

        switch (difficulty) {
            case "EASY": delay = 155; break;
            case "HARD": delay = 82; break;
            default: delay = 120;
        }
        if (!"EASY".equals(difficulty)) createObstacles();
        timer.setDelay(delay);
        placeFood();
        screen = Screen.PLAYING;
        message = "GOOD LUCK!";
        timer.start();
        repaint();
    }
private void createObstacles() {
        int count = "HARD".equals(difficulty) ? 18 : 10;
        for (int i = 0; i < count; i++) {
            Point p;
            int tries = 0;
            do {
                p = new Point(2 + random.nextInt(COLS - 4), 2 + random.nextInt(ROWS - 4));
                tries++;
            } while ((occupiedBySnake(p) || p.distance(COLS / 2, ROWS / 2) < 5 || obstacles.contains(p)) && tries < 100);
            if (tries < 100) obstacles.add(p);
        }
    }

    private boolean occupiedBySnake(Point p) {
        for (Point s : snake) if (s.equals(p)) return true;
        return false;
    }

    private boolean occupied(Point p) {
        return occupiedBySnake(p) || obstacles.contains(p) || p.equals(food) || (bonusFood != null && p.equals(bonusFood));
    }

    private void placeFood() {
        Point p;
        int tries = 0;
        do {
            p = new Point(random.nextInt(COLS), random.nextInt(ROWS));
            tries++;
        } while ((occupiedBySnake(p) || obstacles.contains(p)) && tries < 1000);
        food = p;
    }

    private void spawnBonus() {
        Point p;
        int tries = 0;
        do {
            p = new Point(random.nextInt(COLS), random.nextInt(ROWS));
            tries++;
        } while ((occupiedBySnake(p) || obstacles.contains(p) || p.equals(food)) && tries < 1000);
        bonusFood = p;
        bonusAvailable = true;
        bonusSeconds = 7;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (screen != Screen.PLAYING) return;
        moveSnake();
        repaint();
    }

    private void moveSnake() {
        direction = nextDirection;
        Point head = new Point(snake.get(0));
        switch (direction) {
            case UP: head.y--; break;
            case DOWN: head.y++; break;
            case LEFT: head.x--; break;
            case RIGHT: head.x++; break;
        }

        if (head.x < 0 || head.x >= COLS || head.y < 0 || head.y >= ROWS || obstacles.contains(head)) {
            endGame();
            return;
        }

        boolean eating = head.equals(food);
        boolean eatingBonus = bonusAvailable && head.equals(bonusFood);

        int bodyLimit = snake.size() - (eating || eatingBonus ? 0 : 1);
        for (int i = 0; i < bodyLimit; i++) {
            if (head.equals(snake.get(i))) {
                endGame();
                return;
            }
        }
        
        snake.add(0, head);
        if (eating) {
            score += 10;
            foodsEaten++;
            placeFood();
            playBeep(880);
            if (foodsEaten % 4 == 0 && !bonusAvailable) spawnBonus();
            if (delay > 58) {
                delay -= 3;
                timer.setDelay(delay);
            }
        } else if (eatingBonus) {
            score += 30;
            bonusAvailable = false;
            bonusFood = null;
            playBeep(1200);
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    private void endGame() {
        screen = Screen.GAME_OVER;
        timer.stop();
        message = "RUN ENDED";
        newHighScore = score > highScore;
        if (newHighScore) {
            highScore = score;
            saveHighScore();
        }
        playBeep(220);
        repaint();
    }

    private void playBeep(int frequency) {
        if (soundOn) Toolkit.getDefaultToolkit().beep();
    }

    private int loadHighScore() {
        try {
            if (Files.exists(scoreFile)) {
                String s = Files.readString(scoreFile).trim();
                return Math.max(0, Integer.parseInt(s));
            }
        } catch (Exception ignored) {}
        return 0;
    }

    private void saveHighScore() {
        try {
            Files.writeString(scoreFile, Integer.toString(highScore));
        } catch (IOException ex) {
            message = "Could not save high score";
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawBoard(g2);
        drawSidePanel(g2);

        if (screen == Screen.MENU) drawMenu(g2);
        else if (screen == Screen.PAUSED) drawOverlay(g2, "PAUSED", "Press SPACE to resume");
        else if (screen == Screen.GAME_OVER) drawGameOver(g2);
        g2.dispose();
    }
private void drawBoard(Graphics2D g) {
        g.setColor(BG);
        g.fillRect(0, 0, BOARD_W, BOARD_H);

        g.setColor(new Color(17, 34, 52));
        g.setStroke(new BasicStroke(1f));
        for (int x = 0; x <= BOARD_W; x += TILE) g.drawLine(x, 0, x, BOARD_H);
        for (int y = 0; y <= BOARD_H; y += TILE) g.drawLine(0, y, BOARD_W, y);

        // Board edge glow
        g.setColor(new Color(46, 225, 255, 150));
        g.setStroke(new BasicStroke(2f));
        g.drawRect(1, 1, BOARD_W - 3, BOARD_H - 3);

        // Obstacles
        for (Point p : obstacles) {
            int x = p.x * TILE + 3, y = p.y * TILE + 3;
            g.setColor(new Color(255, 70, 180, 55));
            g.fillRoundRect(x - 2, y - 2, TILE, TILE, 9, 9);
            g.setColor(NEON_PINK);
            g.setStroke(new BasicStroke(2f));
            g.drawRoundRect(x, y, TILE - 6, TILE - 6, 7, 7);
        }

        // Regular food
        g.setColor(new Color(255, 70, 180, 55));
        g.fillOval(food.x * TILE - 4, food.y * TILE - 4, TILE + 8, TILE + 8);
        g.setColor(NEON_PINK);
        g.fillOval(food.x * TILE + 5, food.y * TILE + 5, TILE - 10, TILE - 10);

        // Bonus food
        if (bonusAvailable && bonusFood != null) {
            int bx = bonusFood.x * TILE, by = bonusFood.y * TILE;
            g.setColor(new Color(46, 225, 255, 60));
            g.fillOval(bx - 4, by - 4, TILE + 8, TILE + 8);
            g.setColor(NEON_CYAN);
            int[] xs = {bx + TILE / 2, bx + TILE - 4, bx + TILE / 2, bx + 4};
            int[] ys = {by + 4, by + TILE / 2, by + TILE - 4, by + TILE / 2};
            g.fillPolygon(xs, ys, 4);
        }

        // Snake
        for (int i = snake.size() - 1; i >= 0; i--) {
            Point p = snake.get(i);
            int x = p.x * TILE + 2, y = p.y * TILE + 2;
            if (i == 0) {
                g.setColor(new Color(57, 255, 136, 55));
                g.fillRoundRect(x - 4, y - 4, TILE + 4, TILE + 4, 12, 12);
                g.setColor(NEON_GREEN);
            } else {
                float blend = Math.max(0.35f, 1f - (float) i / Math.max(1, snake.size()) * 0.55f);
                g.setColor(new Color((int)(57 * blend), (int)(255 * blend), (int)(136 * blend)));
            }
            g.fillRoundRect(x, y, TILE - 4, TILE - 4, 8, 8);
            if (i == 0) drawSnakeEyes(g, x, y);
        }
    }

    private void drawSnakeEyes(Graphics2D g, int x, int y) {
        g.setColor(BG);
        if (direction == Direction.LEFT || direction == Direction.RIGHT) {
            int eyeX = direction == Direction.RIGHT ? x + 15 : x + 5;
            g.fillOval(eyeX, y + 5, 4, 4);
            g.fillOval(eyeX, y + 13, 4, 4);
        } else {
            int eyeY = direction == Direction.DOWN ? y + 15 : y + 5;
            g.fillOval(x + 5, eyeY, 4, 4);
            g.fillOval(x + 13, eyeY, 4, 4);
        }
    }
private void drawSidePanel(Graphics2D g) {
        g.setColor(PANEL);
        g.fillRect(BOARD_W, 0, SIDE_W, BOARD_H);
        g.setColor(new Color(46, 225, 255, 100));
        g.drawLine(BOARD_W, 0, BOARD_W, BOARD_H);

        int x = BOARD_W + 20;
        g.setFont(new Font("SansSerif", Font.BOLD, 19));
        g.setColor(NEON_CYAN);
        g.drawString("NEON SNAKE", x, 38);
        g.setColor(MUTED);
        g.setFont(new Font("SansSerif", Font.PLAIN, 11));
        g.drawString("ARCADE EDITION", x, 57);

        drawStat(g, "SCORE", String.format("%04d", score), 95, NEON_GREEN);
        drawStat(g, "BEST", String.format("%04d", highScore), 160, NEON_CYAN);
        drawStat(g, "MODE", difficulty, 225, NEON_PINK);
        drawStat(g, "LENGTH", Integer.toString(snake.size()), 290, NEON_GREEN);

        g.setColor(new Color(37, 56, 78));
        g.drawLine(x, 320, BOARD_W + SIDE_W - 20, 320);

        g.setColor(TEXT);
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        g.drawString("CONTROLS", x, 348);
        g.setFont(new Font("SansSerif", Font.PLAIN, 11));
        g.setColor(MUTED);
        g.drawString("Arrow keys / WASD  Move", x, 371);
        g.drawString("SPACE  Pause / Resume", x, 392);
        g.drawString("R  Restart", x, 413);
        g.drawString("ESC  Main menu", x, 434);

        g.setColor(TEXT);
        g.setFont(new Font("SansSerif", Font.BOLD, 12));
        g.drawString("BONUS FOOD", x, 475);
        g.setFont(new Font("SansSerif", Font.PLAIN, 11));
        g.setColor(MUTED);
        if (bonusAvailable) {
            g.setColor(NEON_CYAN);
            g.drawString("+" + 30 + " points • " + bonusSeconds + " sec", x, 496);
        } else {
            g.drawString("Every 4 regular foods", x, 496);
            g.drawString("Catch it before time runs out", x, 513);
        }

        g.setColor(new Color(37, 56, 78));
        g.drawLine(x, 535, BOARD_W + SIDE_W - 20, 535);
        g.setColor(MUTED);
        g.setFont(new Font("SansSerif", Font.PLAIN, 10));
        g.drawString("Avoid walls and obstacles.", x, 558);
        g.drawString("High score saves automatically.", x, 575);
        g.setColor(NEON_GREEN);
        g.drawString("● SOUND " + (soundOn ? "ON" : "OFF") + "  (M to toggle)", x, 600);
    }

    private void drawStat(Graphics2D g, String label, String value, int y, Color color) {
        int x = BOARD_W + 20;
        g.setColor(MUTED);
        g.setFont(new Font("SansSerif", Font.BOLD, 10));
        g.drawString(label, x, y);
        g.setColor(color);
        g.setFont(new Font("Monospaced", Font.BOLD, 22));
        g.drawString(value, x, y + 25);
    }

    private void drawMenu(Graphics2D g) {
        int x = 75, y = 145, w = BOARD_W - 150, h = 300;
        g.setColor(new Color(5, 10, 22, 235));
        g.fillRoundRect(x, y, w, h, 26, 26);
        g.setStroke(new BasicStroke(2f));
        g.setColor(NEON_CYAN);
        g.drawRoundRect(x, y, w, h, 26, 26);

        g.setFont(new Font("SansSerif", Font.BOLD, 38));
        g.setColor(NEON_GREEN);
        center(g, "NEON SNAKE", 215);
        g.setFont(new Font("SansSerif", Font.PLAIN, 15));
        g.setColor(TEXT);
        center(g, "EAT • GROW • SURVIVE", 250);
        g.setFont(new Font("SansSerif", Font.BOLD, 14));
        g.setColor(NEON_CYAN);
        center(g, "SELECT DIFFICULTY", 295);

        drawChoice(g, "1  EASY", 330, "EASY".equals(difficulty));
        drawChoice(g, "2  MEDIUM", 360, "MEDIUM".equals(difficulty));
        drawChoice(g, "3  HARD", 390, "HARD".equals(difficulty));

        g.setFont(new Font("SansSerif", Font.BOLD, 16));
        g.setColor(NEON_GREEN);
        center(g, "PRESS ENTER TO START", 425);
        g.setFont(new Font("SansSerif", Font.PLAIN, 12));
        g.setColor(MUTED);
        center(g, "1/2/3 difficulty   •   Arrow keys/WASD move   •   M sound", 458);
    }
 private void drawChoice(Graphics2D g, String text, int y, boolean selected) {
        g.setFont(new Font("SansSerif", selected ? Font.BOLD : Font.PLAIN, 14));
        g.setColor(selected ? NEON_PINK : MUTED);
        center(g, (selected ? "▶  " : "    ") + text, y);
    }

    private void drawOverlay(Graphics2D g, String title, String subtitle) {
        g.setColor(new Color(4, 8, 18, 205));
        g.fillRect(0, 0, BOARD_W, BOARD_H);
        g.setColor(NEON_CYAN);
        g.setFont(new Font("SansSerif", Font.BOLD, 42));
        center(g, title, BOARD_H / 2 - 12);
        g.setColor(TEXT);
        g.setFont(new Font("SansSerif", Font.PLAIN, 16));
        center(g, subtitle, BOARD_H / 2 + 28);
    }

    private void drawGameOver(Graphics2D g) {
        g.setColor(new Color(4, 8, 18, 215));
        g.fillRect(0, 0, BOARD_W, BOARD_H);
        g.setColor(NEON_PINK);
        g.setFont(new Font("SansSerif", Font.BOLD, 42));
        center(g, "GAME OVER", BOARD_H / 2 - 55);
        g.setColor(TEXT);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        center(g, "SCORE: " + score, BOARD_H / 2 - 15);
        g.setColor(NEON_CYAN);
        g.setFont(new Font("SansSerif", Font.PLAIN, 16));
        center(g, newHighScore ? "NEW HIGH SCORE!" : "BEST: " + highScore, BOARD_H / 2 + 18);
        g.setColor(NEON_GREEN);
        g.setFont(new Font("SansSerif", Font.BOLD, 15));
        center(g, "PRESS ENTER OR R TO PLAY AGAIN", BOARD_H / 2 + 60);
        g.setColor(MUTED);
        g.setFont(new Font("SansSerif", Font.PLAIN, 12));
        center(g, "ESC to return to main menu", BOARD_H / 2 + 88);
    }

    private void center(Graphics2D g, String text, int y) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(text, (BOARD_W - fm.stringWidth(text)) / 2, y);
    }

    @Override
    protected void processKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            if (screen == Screen.MENU) {
                if (e.getKeyCode() == KeyEvent.VK_1) difficulty = "EASY";
                if (e.getKeyCode() == KeyEvent.VK_2) difficulty = "MEDIUM";
                if (e.getKeyCode() == KeyEvent.VK_3) difficulty = "HARD";
                if (e.getKeyCode() == KeyEvent.VK_M) soundOn = !soundOn;
            } else if (e.getKeyCode() == KeyEvent.VK_M) {
                soundOn = !soundOn;
            }
            repaint();
        }
        super.processKeyEvent(e);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Neon Snake | Arcade Edition");
            SnakeGame game = new SnakeGame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setContentPane(game);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            game.requestFocusInWindow();
        });
    }
}


