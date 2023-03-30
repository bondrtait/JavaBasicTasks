package com.ct.vlevy.CollectionsGenerics;


//Написати метод, який на вхід принімає колекцію обєктів V (Generic), в якій є дублючі обєкти, а вертає колекцію V вже без дублікатів.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RemoveDuplicatesCollection {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        Object obj1 = new Object();
        Object obj2 = new Object();

        objects.add(obj1);
        objects.add(obj2);
        objects.add(new Object());
        objects.add(new Object());
        objects.add(obj1);
        objects.add(obj2);

        System.out.println(objects);
        System.out.println(removeDuplicates(objects));
    }

    static <V> Collection<V> removeDuplicates (Collection<V> input) {
        return new HashSet<>(input);
    }


}
