package com.ct.vlevy.ForArrayBasic;

public class StringRevert {
    public static void main(String[] args) {
        String testString = "PHP Exercises and Python Exercises";

        System.out.println(revertString(testString));
    }

//    Create method which will accept parameter string data and return reverted data
    static String revertString(String s) {
        String revertedString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            revertedString += s.charAt(i);
        }

        return revertedString;
    }
}
