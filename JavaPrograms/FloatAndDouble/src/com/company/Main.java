package com.company;

public class Main {

    public static void main(String[] args) {
        // width of an int = 32 (4 bytes)
	    int myIntValue = 5 / 3;
	    // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    // width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int pounds = 5;
        double convertToKilograms = (double)(pounds * 0.45359237);
        System.out.println(pounds + "pounds is equal to " + convertToKilograms + " kilograms.");

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // 90.7185
        double pi = 3.141_592_7d;
    }
}
