package com.company;

import javax.swing.*;

public class Utility extends JFrame {

    //Restrictions.
    //if d1 is less than 0, d2 less than d1, or n less than 0, use this method
    //if statement is not true, continue the program
    public void setQuadrant1Volume(double d1, double d2, double n) {

        if (d1 < 0 || d2 < d1 || n < 0) {

            JOptionPane.showMessageDialog(null, "\n INVALID\n" +
                    " Please input a positive values\n" +
                    " Also, please ensure your lower domain is less than your higher domain.\n" +
                    " We are only restricted to the first quadrant, please have lower domain greater than 1!\n\n ");


        }
    }

    //same thing as volume excepts for area
    public void setQuadrant1Area(double d1, double d2, double n) {

        if (d2 < d1 || n < 0) {

            JOptionPane.showMessageDialog(null, "\n INVALID\n" +
                    " Please input a positive values\n" +
                    " Also, please ensure your lower domain is less than your higher domain.\n\n ");

        }
    }
}



