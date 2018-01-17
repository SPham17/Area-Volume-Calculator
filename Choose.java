package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose extends JFrame {

    AreaFunctions area = new AreaFunctions();
    VolumeFunctions volume = new VolumeFunctions();

    public Choose(){
        super("Choosing Calculator");

        setSize(280, 500);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("Please choose: Area or Volume? ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel Name = new JLabel("Welcome!");

        // Here is our prompt
        JLabel promptName = new JLabel("Choice: ");

        // Here is our button
        JButton buttonArea = new JButton("Area");

        JButton buttonVolume = new JButton("Volume");

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(Name);
        add(promptName);
        add(buttonArea);
        add(buttonVolume);


        // closes the JFrame when clicking "button"
        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                setVisible(true);
                JPopupMenu function = new JPopupMenu("Please choose a function!");

                JButton Linear = new JButton("Linear function");
                JButton Quadratic = new JButton("Quadratic function");
                JButton Sine = new JButton("Sinusoidal function ( Sine )");
                JButton Cosine = new JButton("Sinusoidal function ( Cosine )");

                add(function);
                add(Linear);
                add(Quadratic);
                add(Sine);
                add(Cosine);
                 Linear.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                         area.Linearfunction();
                         area.setVisible(true);
                         dispose();
                     }
                 });

                 Quadratic.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                         area.Quadraticfunction();
                         area.setVisible(true);
                         dispose();
                      }
                 });

                Sine.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        area.Sinefunction();
                        area.setVisible(true);
                        dispose();
                    }
                });

                Cosine.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        area.Cosinefunction();
                        area.setVisible(true);
                        dispose();
                    }
                });

            }
        });

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                volume.setVisible(true);
                dispose();
            }
        });

    }


}


