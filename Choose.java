package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose extends JFrame {

    String n;
    //access within specified classes
    AreaFunctions area = new AreaFunctions();
    VolumeFunctions volume = new VolumeFunctions();

    public void setName(String n) {
        JF_many_components name = new JF_many_components();
        n = name.n;

        getName(n);

    }

    public String getName(String n) {
        JF_many_components name = new JF_many_components();
        n = name.n;


        new JTextField(n);

        return n;
    }


    public Choose() {
        super("Choosing Calculator");

        setSize(400, 500);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        JLabel heading = new JLabel("Please choose: Area or Volume? ( click area twice ) ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel Name = new JLabel("Welcome:!" + getName());

        JLabel promptName = new JLabel("Choice: ");

        JButton buttonArea = new JButton("Area");

        JButton buttonVolume = new JButton("Volume");


        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(Name);
        add(promptName);
        add(buttonArea);
        add(buttonVolume);

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                setVisible(true);

                //different buttons are added when clicking buttonArea
                JButton Linear = new JButton("Linear function");
                JButton Quadratic = new JButton("Quadratic function");
                JButton Sine = new JButton("Sinusoidal function ( Sine )");
                JButton Cosine = new JButton("Sinusoidal function ( Cosine )");

                add(Linear);
                add(Quadratic);
                add(Sine);
                add(Cosine);

                Linear.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Linear button goes to AreaFunctions.LinearFunction
                        //sets window to true
                        area.Linearfunction();
                        area.setVisible(true);
                        dispose();
                    }//end of actionPerformed
                });//end of actionListener

                Quadratic.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Quadratic button goes to AreaFunctions.QuadraticFunction
                        //sets window to true
                        area.Quadraticfunction();
                        area.setVisible(true);
                        dispose();
                    }//end of actionPerformed
                });//end of actionListener

                Sine.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Sine button goes to AreaFunctions.SineFunction
                        //sets window to true
                        area.Sinefunction();
                        area.setVisible(true);
                        dispose();
                    }//end of actionPerformed
                });//end of actionListener

                Cosine.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Cosine button goes to AreaFunctions.CosineFunction
                        //sets window to true
                        area.Cosinefunction();
                        area.setVisible(true);
                        dispose();
                    }//end of actionPerformed
                });//end of actionListener
            }//end of actionPerformed
        });//end of actionListener

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //buttonVolume button goes to VolumeFunctions
                //sets window to true
                volume.setVisible(true);
                dispose();
            }//end of actionPerformed
        });//end of actionListener

    }//end of constructor
}//end of class



