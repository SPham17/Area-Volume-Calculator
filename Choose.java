package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose extends JFrame {

    AreaFunctions area = new AreaFunctions();
    VolumeFunctions volume = new VolumeFunctions();

    public void ChooseType(){
        setSize(300, 500);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Here is our heading
        JLabel heading = new JLabel("Please choose: Area or Volume? ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        // Here is our prompt
        JLabel promptName = new JLabel("Choice: ");

        // Here is our button
        JButton buttonArea = new JButton("Area");

        JButton buttonVolume = new JButton("Volume");

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(buttonArea);
        add(buttonVolume);


        // closes the JFrame when clicking "button"
        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                area.Area();
                dispose();
            }
        });

        buttonVolume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                volume.Volume();
                dispose();
            }
        });


    }


}


