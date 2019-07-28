package com.wloszynski;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){
        double firstNumber = (double)Math.round(firstParameter * 1000d) / 1000d;
        double secondNumber = (double)Math.round(secondParameter * 1000d) / 1000d;

        if(firstNumber==secondNumber){
            return true;
        } else {
            return false;
        }
    }
}
