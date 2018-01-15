package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JF_many_components extends JFrame {

    final int F_WIDTH   =  300;
    final int F_HEIGHT  =  500;

    Choose choose = new Choose();

    public JF_many_components() {

        super("Steven's Function Book");

        setSize(F_WIDTH, F_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("Welcome to Steven's functions book ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        // Here is our prompt
        JLabel promptName = new JLabel("Please enter your name: ");

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

        // closes the JFrame when clicking "button"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button)

                choose.setSize(300,300);
                choose.setVisible (true);
                dispose();
            }
        });

    }


}