/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
   
       
      
        public static void main(String[] args) {
        // Create frame

        // Create frame
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create buttons
        JButton redBtn = new JButton("Red");
        JButton greenBtn = new JButton("Green");
        JButton blueBtn = new JButton("Blue");

        // Add ActionListeners
        redBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        greenBtn.addActionListener(new ActionListener() 
        {
        	
            public void actionPerformed(ActionEvent e) 
            {
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });

        blueBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        // Add buttons to frame
        frame.add(redBtn);
        frame.add(greenBtn);
        frame.add(blueBtn);

        // Make frame visible
        frame.setVisible(true);
    }

    
}
