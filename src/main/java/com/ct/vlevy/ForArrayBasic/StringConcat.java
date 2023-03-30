package com.ct.vlevy.ForArrayBasic;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "PHP Exercises and ";
        String s2 = "Python Exercises";

        System.out.println(concatAndRemovePs(s1, s2));
    }

// Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
    static String concatAndRemovePs (String s1, String s2) {
        return (s1 + s2).replaceAll("[Pp]", "");
    }
}
