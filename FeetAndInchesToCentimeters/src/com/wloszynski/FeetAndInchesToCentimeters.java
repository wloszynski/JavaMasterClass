package com.wloszynski;

public class FeetAndInchesToCentimeters {
    public static double calcFootAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (feet * 12 + inches) * 2.54d;

        } else {
            return -1;
        }
    }

    public static double calcFootAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)inches / 12;
            inches %= 12;
            return calcFootAndInchesToCentimeters(feet,inches);
        } else {
            return -1;
        }
    }
}
