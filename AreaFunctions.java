package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaFunctions extends JFrame {
    // variables for sine, cosine, and quadratic
    double a, k, d, c;
    // variable for quadratic
    double h;
    // variables for linear
    double m, b;
    // general variables for all functions
    double d1, d2, n, width, length, gx, Area, rectangle;
    // radians or degrees
    boolean radians = true;
    // access to utility class
    Utility rad = new Utility();

    public AreaFunctions() {
        super("Steven's Area Calculator™");

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }


    public void Linearfunction() {
        setSize(400, 400);

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Linear");

        //sets label for each input(JTextField)
        //inputs JTextField corresponding to which label it is referred to
        JLabel M = new JLabel("Please enter your slope: ");
        JTextField slope = new JTextField(12);

        JLabel B = new JLabel("Please enter your y - intercept: ");
        JTextField yint = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the accuracy: ");
        JTextField N = new JTextField(12);

        JLabel Gxx = new JLabel(" Please input a gx function: ");
        JTextField Gx = new JTextField(12);

        JButton buttonArea = new JButton("Calculate Area!");

        JLabel AreaDisplay = new JLabel();

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

                Area = 0;

                //Convert textFields to Doubles
                m = Double.parseDouble(slope.getText());
                b = Double.parseDouble(yint.getText());
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());
                gx = Double.parseDouble(Gx.getText());

                //Restriction
                //if conditions are met, input "Error"
                //refer to Utility class
                if (d1 < 0 || d2 < d1 || n < 0) {

                    AreaDisplay.setText("Error");
                    rad.setQuadrant1Area(d1, d2, n);

                    // if conditions are not met, continue profram
                }else{
                    //finds width of rectangles, cuts evenly dividing by amount of iterations
                    width = (d2 - d1) / n;
                    //finds initial length of rectangle
                    length = m * d1 + b - gx;

                    //loops for amount of iterations user inputs
                    for (double x = 0; x < n; x++) {
                        //calculates area of rectangle
                        rectangle = Math.abs(width * length);
                        //moves rectangle over one unit
                        d1 += width;
                        //find new length of the moved rectangle
                        length = m * d1 + b - gx;
                        //add the calculated area to total area
                        Area += rectangle;
                        //input answer to AreaDisplay, a JLabel
                        AreaDisplay.setText(String.valueOf(Area));
                    }//end of loop
                }//end of else
            }//end of actionPerformed
        });//end of actionListener
    }//end of method

    public void Quadraticfunction() {

        setSize(420, 400);

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Quadratic");

        JLabel A = new JLabel("Please enter your a value: ");
        JTextField Vert = new JTextField(12);

        JLabel H = new JLabel("Please enter your h value: ");
        JTextField Horz = new JTextField(12);

        JLabel K = new JLabel("Please enter your k value: ");
        JTextField yq = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the accuracy: ");
        JTextField N = new JTextField(12);

        JLabel Gxx = new JLabel(" Please input a gx function: ");
        JTextField Gx = new JTextField(12);

        JButton buttonArea = new JButton("Calculate Area!");

        JLabel AreaDisplay = new JLabel();

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(A);
        add(Vert);
        add(H);
        add(Horz);
        add(K);
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

                Area = 0;

                a = Double.parseDouble(Vert.getText());
                h = Double.parseDouble(Horz.getText());
                k = Double.parseDouble((yq.getText()));
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());
                gx = Double.parseDouble(Gx.getText());

                if (d1 < 0 || d2 < d1 || n < 0) {

                    AreaDisplay.setText("Error");
                    rad.setQuadrant1Area(d1, d2, n);

                }else {
                    //finds width of rectangles, cuts evenly dividing by amount of iterations
                    width = (d2 - d1) / n;
                    //finds initial length of rectangles
                    length = a * (d2 - h) * (d1 - h) + k - gx;

                    for (double x = 0; x < n; x++) {
                        //calculates area for rectangle
                        rectangle = Math.abs(width * length);
                        //moves rectangle one unit right
                        d1 += width;
                        //calculates new length of moved triangle
                        length = a * (d1 - h) * (d1 - h) + k - gx;
                        //add area of rectangle to total Area
                        Area += rectangle;
                        //input answer into AreaDisplay, a JLabel
                        AreaDisplay.setText(String.valueOf(Area));
                    }//end of loop
                }//end of else
            }//end of actionPerformed
        });//end of actionListener
    }//end of method

    public void Sinefunction() {

        setSize(360, 400);

        JLabel heading = new JLabel("You have chosen the area option! ");
        heading.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel promptName = new JLabel("Area of a Curve: Sinusoidal (Sine)");

        JLabel AA = new JLabel("Please enter your a value: ");
        JTextField A = new JTextField(12);

        JLabel KK = new JLabel("Please enter your k value: ");
        JTextField K = new JTextField(12);

        JLabel DD = new JLabel("Please enter your D value: ");
        JTextField D = new JTextField(12);

        JLabel CC = new JLabel("Please enter your C value: ");
        JTextField C = new JTextField(12);

        JLabel DomainLow = new JLabel("Please enter your lower domain: ");
        JTextField D1 = new JTextField(12);

        JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
        JTextField D2 = new JTextField(12);

        JLabel Accuracy = new JLabel("Please enter the accuracy: ");
        JTextField N = new JTextField(12);

        JLabel Gxx = new JLabel(" Please input a gx function: ");
        JTextField Gx = new JTextField(12);

        JToggleButton Rad = new JToggleButton("Toggle me for Degrees!");

        JButton buttonArea = new JButton("Calculate Area!");

        JLabel AreaDisplay = new JLabel();

        setLayout(new FlowLayout());

        // Add components to the JFrame
        add(heading);
        add(promptName);
        add(AA);
        add(A);
        add(KK);
        add(K);
        add(DD);
        add(D);
        add(CC);
        add(C);
        add(DomainLow);
        add(D1);
        add(DomainHigh);
        add(D2);
        add(Accuracy);
        add(N);
        add(Gxx);
        add(Gx);
        add(Rad);
        add(buttonArea);
        add(AreaDisplay);

        //adds actionListener to toggle button
        Rad.addActionListener(new ActionListener() {
            //if toggle button is clicked, perform actions
            public void actionPerformed(ActionEvent e) {
                //if toggle button is clicked, set radians to false
                if (Rad.isSelected()) {

                    radians = false;
                    JOptionPane.showMessageDialog(null,"Degrees Active!");

                // if toggle button is not clicked, or unclicked, set radians to true
                } else {

                    radians = true;
                    JOptionPane.showMessageDialog(null, "Radians Active");


                }//end of else
            }//end of actionPerformed
        });//end of actionListener

        buttonArea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Area = 0;

                //sets textsfields to doubles
                a = Double.parseDouble(A.getText());
                k = Double.parseDouble(K.getText());
                d = Double.parseDouble(D.getText());
                c = Double.parseDouble(C.getText());
                d1 = Double.parseDouble(D1.getText());
                d2 = Double.parseDouble(D2.getText());
                n = Double.parseDouble(N.getText());
                gx = Double.parseDouble(Gx.getText());

                //
                if (radians) {

                    d1 = Math.toRadians(d1);
                    d2 = Math.toRadians(d2);

                }

                if (d1 < 0 || d2 < d1 || n < 0) {

                    AreaDisplay.setText("Error");
                    rad.setQuadrant1Area(d1, d2, n);

                }else {
                    //finds width of rectangles, cuts evenly dividing by amount of iterations
                    width = (d2 - d1) / n;
                    //finds initial length of rectangles
                    length = a * (Math.sin(k * (d1 - d))) + c - gx;

                    //loops by amount of iterations
                    for (double x = 0; x < n; x++) {

                        //formula for calculating area of rectangle
                        rectangle = Math.abs(width * length);

                        //moves rectangle over one unit
                        d1 += width;
                        //finds new length after moved one unit
                        length = a * (Math.sin(k * (d1 - d))) + c - gx;
                        //add area of rectangle to total area
                        Area += rectangle;
                        //displays area in the AreaDisplay JLabel
                        AreaDisplay.setText(String.valueOf(Area));
                    }//end of loop
                }//end of else
            }//end of actionPerformed
        });//end of actionListener
    }//end of method

            public void Cosinefunction() {

                setSize(360, 400);

                JLabel heading = new JLabel("You have chosen the area option! ");
                heading.setFont(new Font("Arial", Font.BOLD, 14));

                JLabel promptName = new JLabel("Area of a Curve: Sinusoidal (Cosine)");

                JLabel AA = new JLabel("Please enter your a value: ");
                JTextField A = new JTextField(12);

                JLabel KK = new JLabel("Please enter your k value: ");
                JTextField K = new JTextField(12);

                JLabel DD = new JLabel("Please enter your D value: ");
                JTextField D = new JTextField(12);

                JLabel CC = new JLabel("Please enter your C value: ");
                JTextField C = new JTextField(12);

                JLabel DomainLow = new JLabel("Please enter your lower domain: ");
                JTextField D1 = new JTextField(12);

                JLabel DomainHigh = new JLabel("Please enter your higher domain: ");
                JTextField D2 = new JTextField(12);

                JLabel Accuracy = new JLabel("Please enter the accuracy: ");
                JTextField N = new JTextField(12);

                JLabel Gxx = new JLabel(" Please input a gx function: ");
                JTextField Gx = new JTextField(12);

                JToggleButton Rad = new JToggleButton("Toggle me for Degrees!");


                // Here is our button
                JButton buttonArea = new JButton("Calculate Area!");

                JLabel AreaDisplay = new JLabel();

                setLayout(new FlowLayout());

                // Add components to the JFrame
                add(heading);
                add(promptName);
                add(AA);
                add(A);
                add(KK);
                add(K);
                add(DD);
                add(D);
                add(CC);
                add(C);
                add(DomainLow);
                add(D1);
                add(DomainHigh);
                add(D2);
                add(Accuracy);
                add(N);
                add(Gxx);
                add(Gx);
                add(Rad);
                add(buttonArea);
                add(AreaDisplay);

                Rad.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        if (Rad.isSelected()) {

                            radians = false;
                            JOptionPane.showMessageDialog(null,"Degrees Active!");


                        } else {

                            radians = true;
                            JOptionPane.showMessageDialog(null, "Radians Active");

                        }
                    }
                });

                buttonArea.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        Area = 0;

                        // We have to parse the text to a type double.
                        a = Double.parseDouble(A.getText());
                        k = Double.parseDouble(K.getText());
                        d = Double.parseDouble(D.getText());
                        c = Double.parseDouble(C.getText());
                        d1 = Double.parseDouble(D1.getText());
                        d2 = Double.parseDouble(D2.getText());
                        n = Double.parseDouble(N.getText());
                        gx = Double.parseDouble(Gx.getText());

                        if (radians) {

                            d1 = Math.toRadians(d1);
                            d2 = Math.toRadians(d2);

                        }


                        if (d1 < 0 || d2 < d1 || n < 0) {
                            AreaDisplay.setText("Error");
                            rad.setQuadrant1Area(d1, d2, n);

                        }else {
                            //finds width of rectangles, cuts evenly dividing by amount of iterations
                            width = (d2 - d1) / n;
                            //finds initial length of rectangles
                            length = a * (Math.cos(k * (d1 - d))) + c - gx;

                            //loops by amount of iterations
                            for (double x = 0; x < n; x++) {

                                //formula for calculating area of rectangle
                                rectangle = Math.abs(width * length);

                                //moves rectangle over one unit
                                d1 += width;
                                //finds new length after moved one unit
                                length = a * (Math.cos(k * (d1 - d))) + c - gx;
                                //add area of rectangle to total area
                                Area += rectangle;
                                //displays area in the AreaDisplay JLabel
                                AreaDisplay.setText(String.valueOf(Area));

                            }//end of loop
                        }//end of else
                    }//end of actionPerformed
                });//end of actionListener
            }//end of method
    }






