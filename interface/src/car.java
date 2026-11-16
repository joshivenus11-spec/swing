
public class car implements brake,engine,musicplayer {

    @Override
    public void brake() {
        System.out.println("i brake like  a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println(" i stop enginer like a noremal car");
    }

    @Override
    public void acc() {
        System.out.println(" i accelerate like a normal car");
    }
}
