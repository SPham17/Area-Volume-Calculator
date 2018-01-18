package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaFunctions extends JFrame {

    public AreaFunctions() {
        super("Steven's Area Calculator™");

        setSize(400, 400);


        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }



    public void Linearfunction() {

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Linear");

        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField N = new JTextField(12);

        JLabel Gxx = new JLabel(" Please input a gx function: ");
        JTextField Gx = new JTextField(12);

        // Here is our button
        JButton buttonArea = new JButton("Calculate Area!");

        JTextField AreaDisplay = new JTextField(12);

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(M);
        add(slope);
        add(B);
        add(yint);
        add(DomainLow);
        add(D1);
        add(DomainHigh);
        add(D2);
        add(Accuracy);
        add(N);
        add(Gxx);
        add(Gx);
        add(buttonArea);
        add(AreaDisplay);

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double m, b, d1, d2, n, width, length, gx, Area, rectangle;

                Area = 0;

                // We have to parse the text to a type double.
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());
                gx = Double.parseDouble(Gx.getText());

                width = (d2 - d1) / n;       // gets the width of the small rectangles, divides by number of slices to create even slices
                length = m * d1 + b - gx;      // gets height (length) of the initial small rectangle

                for (double x = 0; x < n; x++) {               // keeps adding one rectangle until it reaches the number of slices

                    rectangle = Math.abs(width * length); // calculates area of the rectangle, absolute value for positive area

                    d1 += width;                         // moves rectangle over to the right one point
                    length = m * d1 + b - gx; // finds new height for new rectangle

                    Area += rectangle;                         // adds rectangle to the total area

                    AreaDisplay.setText(String.valueOf(Area));
                }

            }
        });}

    public void Quadraticfunction() {

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Linear");

        JLabel A = new JLabel("Please enter your a value: ");
        JTextField Vert = new JTextField(12);

        JLabel H = new JLabel("Please enter your h value: ");
        JTextField Horz = new JTextField(12);

        JLabel C = new JLabel("Please enter your c value: ");
        JTextField yq = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField N = new JTextField(12);

        JLabel Gxx = new JLabel(" Please input a gx function: ");
        JTextField Gx = new JTextField(12);

        // Here is our button
        JButton buttonArea = new JButton("Calculate Area!");

        JTextField AreaDisplay = new JTextField(12);

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(A);
        add(Vert);
        add(H);
        add(Horz);
        add(C);
        add(yq);
        add(DomainLow);
        add(D1);
        add(DomainHigh);
        add(D2);
        add(Accuracy);
        add(N);
        add(Gxx);
        add(Gx);
        add(buttonArea);
        add(AreaDisplay);

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double a, h, c, d1, d2, n, width, length, gx, Area, rectangle;

                Area = 0;

                // We have to parse the text to a type double.
                a = Double.parseDouble(Vert.getText());
                h = Double.parseDouble(Horz.getText());
                c = Double.parseDouble((yq.getText()));
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());
                gx = Double.parseDouble(Gx.getText());

                width = (d2 - d1) / n;                                                // gets the width of the small rectangles, divides by number of slices to create even slices
                length = a * (d2 - h)*(d1 - h) + c - gx;   // gets initial height of the rectangle

                for (double x = 0; x < n; x++) {                                                // continues adding rectangles until reaches number of slices

                    rectangle = Math.abs(width * length);                                              // calculates area of the rectangle, absolute value for positive area

                    d1 += width;                                                                      // moves rectangle over to the right one point
                    length = a * (d1 - h)*(d1 - h) + c - gx;           // finds new height for the new rectangle

                    Area += rectangle;

                    AreaDisplay.setText(String.valueOf(Area));
                }

            }
        });}

    public void Sinefunction() {

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Sinusoidal (Sine)");

        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField d1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField d2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField n = new JTextField(12);

        // Here is our button
        JButton buttonArea = new JButton("Calculate Area!");

        JTextField AreaDisplay = new JTextField(12);

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(M);
        add(slope);
        add(B);
        add(yint);
        add(DomainLow);
        add(d1);
        add(DomainHigh);
        add(d2);
        add(Accuracy);
        add(n);
        add(buttonArea);
        add(AreaDisplay);

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double m, b, d1, d2, n, dradius, Area;

                Area = 0;

                // We have to parse the text to a type double.
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(DomainLow.getText());
                d2 = Double.parseDouble(DomainLow.getText());
                n = Double.parseDouble(Accuracy.getText());

            }
        });}

    public void Cosinefunction() {

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Sinusoidal (Cosine)");

        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField d1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField d2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the amount of iterations: ");
        JTextField n = new JTextField(12);

        // Here is our button
        JButton buttonArea = new JButton("Calculate Area!");

        JTextField AreaDisplay = new JTextField(12);

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(M);
        add(slope);
        add(B);
        add(yint);
        add(DomainLow);
        add(d1);
        add(DomainHigh);
        add(d2);
        add(Accuracy);
        add(n);
        add(buttonArea);
        add(AreaDisplay);

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // First we define double variables.
                double m, b, d1, d2, n, dradius, Area;

                Area = 0;

                // We have to parse the text to a type double.
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(DomainLow.getText());
                d2 = Double.parseDouble(DomainLow.getText());
                n = Double.parseDouble(Accuracy.getText());

            }
        });
    }
}



