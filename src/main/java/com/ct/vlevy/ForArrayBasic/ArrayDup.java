package com.ct.vlevy.ForArrayBasic;

public class ArrayDup {
    public static void main(String[] args) {
        int[] array = new int[] {31, 1335, 11, 2654, 8, 446, 685, 447, 985, 44, 978, 325,
                4698, 447, 685, 234, 11, 8, 4};

        findDuplicatesInArray(array);
    }

    //- Write a Java program to find the duplicate values of an array of integer values
    static void findDuplicatesInArray (int[] arr) {
        int[] traversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] == traversedArray[j]) {
                    System.out.println("The element with index [" + i + "] and value " + arr[i] + " is a duplicate.");
                }
            }

            traversedArray[i] = arr[i];
        }
    }
}
