package com.ct.vlevy.CollectionsGenerics;

import java.util.HashMap;
import java.util.Map;

//Побудувати частотний словник букв алфавіту.
// Створити метод, який принімає текс і вертає словник, в якиму міститься символ і його кількість.
// Приклад: ollo
// o - 2
// l - 2
// Текст взяти свій

public class AlphabetFrequencyDic {
    public static void main(String[] args) {
        String sampleSting = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        System.out.println(getLettersFrequency(sampleSting));
    }

    static Map<Character, Integer> getLettersFrequency(String input) {
        String inputLowerCased = input.toLowerCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        char currentChar;

        for (int i = 0; i < inputLowerCased.length(); i++) {
            currentChar = inputLowerCased.charAt(i);
            if (Character.isLetter(currentChar)) {
                frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
