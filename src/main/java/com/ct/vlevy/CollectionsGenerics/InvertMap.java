package com.ct.vlevy.CollectionsGenerics;

import java.util.*;

//Написати метод, який принімає Map<K, V> і вертає Map, де ключі і значення поміняні місцями.
// Так як значення можуть бути не унікальними, то тип значення в Map буде вже не K,
// а Collection<K>: Map<V, Collection<K>>/

public class InvertMap {
    public static void main(String[] args) {
        Map<Integer, String> mapToInvert = Map.of(1, "One", 2, "Two", 3, "Three",
                4, "Four", 11, "One", 22, "Two", 44, "Four");

        System.out.println(invertMap(mapToInvert));
    }

    static <V, K> Map<V, Collection<K>> invertMap(Map<K, V> mapToInvert) {
        Map<V, Collection<K>> invertedMap = new HashMap<>();

        V currentValue;
        K currentKey;
        for (Map.Entry<K, V> entry : mapToInvert.entrySet()) {
            currentValue = entry.getValue();
            currentKey = entry.getKey();
            if (invertedMap.containsKey(currentValue)) {
                invertedMap.get(currentValue).add(currentKey);
            } else {
                ArrayList<K> keysList = new ArrayList<>();
                keysList.add(currentKey);
                invertedMap.put(currentValue, keysList);

            }
        }

        return invertedMap;
    }
}
