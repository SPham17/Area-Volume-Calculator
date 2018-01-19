package com.company;

import javax.swing.*;

public class Utility extends JFrame {

    boolean Degrees;
    double d1;
    double d2;

    public void setQuadrant1Volume(double d1, double d2, double n) {

        if (d1 < 0 || d2 < d1 || n < 0) {

            JOptionPane.showMessageDialog(null, "\n INVALID\n" +
                    " Please input a positive values\n" +
                    " Also, please ensure your lower domain is less than your higher domain.\n\n ");


        } else {

        }
    }

    public void setQuadrant1Area(double d1, double d2, double n) {

        if (d2 < d1 || n < 0) {

            JOptionPane.showMessageDialog(null, "\n INVALID\n" +
                    " Please input a positive values\n" +
                    " Also, please ensure your lower domain is less than your higher domain.\n\n ");


        } else {

        }
    }
}



