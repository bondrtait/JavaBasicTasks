package com.ct.vlevy.ForArrayBasic;

public class ArraySum {
    static final int MAX_ARRAY_LENGTH = 100;
    static final int MIN_ARRAY_LENGTH = 10;
    static final int MAX_ARRAY_VALUE = 1000;

    public static void main(String[] args) {
        //1.Create array with your data (integer)
        int[] arrayHardCode = new int[] {31, 1335, 11, 2654, 8, 446, 685, 487, 985, 44, 978, 325, 4698, 447, 685, 234};

        //2.Create array with random data (integer)
        int[] arrayRand = getRandomArray();

        System.out.println("The sum of the elements of the hard coded array: " + arraySum(arrayHardCode));
        System.out.println("The sum of the elements of the randomly generated array: " + arraySum(arrayRand));
    }

    //Write a Java program to sum values of an array.
    static long arraySum(int[] arr) {
        long sum = 0;

        for (int el : arr) {
            sum += el;
        }

        return sum;
    }

    static int[] getRandomArray() {
        int arraySize = (int) (Math.random() * (MAX_ARRAY_LENGTH - MIN_ARRAY_LENGTH + 1) + MIN_ARRAY_LENGTH);
        int[] arrayRand = new int[arraySize];

        for (int i = 0; i < arrayRand.length; i++) {
            arrayRand[i] = (int) (Math.random() * (MAX_ARRAY_VALUE + 1));
        }

        return arrayRand;
    }
}
