package com.wloszynski;

public class Main {

    public static void main(String[] args) {

        //float - 32b single precision
        //double - 64b double precision

        //float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float maximum value = " + myMinFloatValue);
        System.out.println("Float minimum value = " + myMinFloatValue);

        //double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double maximum value = " + myMinDoubleValue);
        System.out.println("Double minimum value = " + myMinDoubleValue);

//        int myIntValue = 5/2;
        int myIntValue = 5/3;
//        float myFloatValue = (float) 5.25;
//        float myFloatValue = 5f/2f;
        float myFloatValue = 5f/3f;
//        double myDoubleValue = 5.25d;
//        double myDoubleValue = 5d/2d;
        double myDoubleValue = 5d/3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //exercise

        double numOfPounds = 8.23;
        double poundToKg = 0.45359237;
        double kilograms=numOfPounds*poundToKg;

        System.out.println(numOfPounds + "pounds converted to kg is " + kilograms +"kg");

        //pi
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
