package com.company;

import javax.swing.*;
import java.awt.*;

public class JF_many_components extends JFrame {

    final int F_WIDTH   =  300;
    final int F_HEIGHT  =  500;

    public JF_many_components(){

        super("JFrame Many Components");

        setSize(F_WIDTH,F_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("Frame has Many Components");
        heading.setFont( new Font("Arial", Font.BOLD, 14));

        // Here is our prompt
        JLabel promptName =  new JLabel("Please enter your name: ");

        // Here is our text field
        JTextField nameField = new JTextField(12);

        // Here is our button
        JButton button = new JButton("Click to Continue");

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(nameField);
        add(button);


    }




}