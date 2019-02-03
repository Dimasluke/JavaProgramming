package com.company;

public class Main {

    public static void main(String[] args) {

        // Integer had a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // Short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        // Long has a width of 64
        long myLongValue = 100L;

        byte byteNumber = 120;
        short shortNumber = 30_000;
        int intNumber = 1_000_000;
        long longNumber = (long)(50_000 + (10*(byteNumber + +shortNumber + intNumber)));
        short myShortNumber = (short)(50_000 + (10*(byteNumber + +shortNumber + intNumber)));
    }
}
