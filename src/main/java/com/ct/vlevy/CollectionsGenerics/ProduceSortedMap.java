package com.ct.vlevy.CollectionsGenerics;
//Написати метод, який принімає два масиви/списки елементів типу K, V (Generic)
// з однаковою/різною кількість елементів і вертає сортований Map<K, V>.
// Варіант 1. Якщо масив K > V - то записати в value null, якщо масив K < V - зайві value не обробляти
// Варіант 2. Якщо масив K > V - перехватит помилку і вивести на екран повідомлення "Value is not enough for map",
// якщо масив K < V - перехватит помилку і вивести на екран повідомлення "Key is not enough for map"

import java.util.*;

public class ProduceSortedMap {
    public static void main(String[] args) {
        //two equal length lists
        List<String> strings1 = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Merging two lists of equal length");

        System.out.println("Variant 1:");
        System.out.println(mergeIntoSortedMap1(strings1, integers1));

        System.out.println("Variant 2:");
        try {
            System.out.println(mergeIntoSortedMap2(strings1, integers1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        //list K is bigger
        List<String> strings2 = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        List<Integer> integers2 = List.of(1, 2, 3, 4, 5);

        System.out.println("Merging two lists where K > V");

        System.out.println("Variant 1:");
        System.out.println(mergeIntoSortedMap1(strings2, integers2));

        System.out.println("Variant 2:");
        try {
            System.out.println(mergeIntoSortedMap2(strings2, integers2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        //list V is bigger
        List<String> strings3 = List.of("One", "Two", "Three", "Four", "Five");
        List<Integer> integers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Merging two lists where K < V");

        System.out.println("Variant 1:");
        System.out.println(mergeIntoSortedMap1(strings3, integers3));

        System.out.println("Variant 2:");
        try {
            System.out.println(mergeIntoSortedMap2(strings3, integers3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }

    static <K, V> Map<K, V> mergeIntoSortedMap1 (List<K> list1, List<V> list2){
        Map<K, V> newMap = new HashMap<>();

        for (int i = 0; i < list1.size(); i++) {
            newMap.put(list1.get(i), i >= list2.size() ? null : list2.get(i));
        }

        return newMap;
    }

    static <K, V> Map<K, V> mergeIntoSortedMap2 (List<K> list1, List<V> list2) {
        if (list1.size() > list2.size()) {
            throw new IllegalArgumentException("Value is not enough for map");
        }

        if (list1.size() < list2.size()) {
            throw new IllegalArgumentException("Key is not enough for map");
        }

        Map<K, V> newMap = new HashMap<>();

        for (int i = 0; i < list1.size(); i++) {
            newMap.put(list1.get(i), list2.get(i));
        }

        return newMap;
    }
}
