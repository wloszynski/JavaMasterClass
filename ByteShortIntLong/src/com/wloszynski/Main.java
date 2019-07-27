package com.wloszynski;

public class Main {

    public static void main(String[] args) {

        //int - 32b
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);

        //overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        //underflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest=2_147_483_647;

        //byte - 8b
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        //short - 16b
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);
        
        //long - 64b
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue=32767;

        int myTotal = (myMinIntValue/2);

        //cast
        byte myNewByteValue = (byte)(myMinByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        //exercise
        byte myByteVariable = 120;
        short myShortVariable = 2345;
        int myIntVariable = 2147483647;
        long myLongVariable = 50000L + 10*(myByteVariable+myShortVariable+myIntVariable);
        System.out.println(myLongVariable);



    }
}
