package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JF_many_components extends JFrame {

    String n;

    //set window sizes, (w x h)
    final int F_WIDTH   =  300;
    final int F_HEIGHT  =  500;

    //access withih class Choose
    Choose choose = new Choose();

    public JF_many_components() {
        //title on screen
        super("Steven's Function Book");

        setSize(F_WIDTH, F_HEIGHT);

        //default option when clicking the x button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //heading
        //heading font is set
        JLabel heading = new JLabel("Welcome to Steven's functions book ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        //prompt
        JLabel promptName = new JLabel("Please enter your name: ");

        //textfield for users to input
        JTextField nameField = new JTextField(12);

        //button for users to click
        JButton button = new JButton("Click to Continue");

        //sets layout for frame
        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(nameField);
        add(button);

        //adding button listener to "Listen to the action"
        button.addActionListener(new ActionListener() {
            //inside this, when the action is performed, whatever is inside determines what will happen
            public void actionPerformed(ActionEvent e) {

                    n = nameField.getText();
                    choose.setName(n);

                    //jframe inside Choose will be true
                    choose.setVisible(true);
                    //closes jframe after button is clicked
                    dispose();
            }
        });

    }



}