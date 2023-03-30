package com.ct.vlevy.CollectionsGenerics;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//Створити String масив з замовленнями (з дублюючими замовленнями), які прийшли в інтернет магазин.
// Створити два види колекцій HashSet та TreeSet, в які потрібно добавлятись наші замовлення.
// Вевести на екран список з HashSet та з TreeSet окремо один від одного.




public class OrderSets {
    public static void main(String[] args) {
        String[] orders = {"Pen", "Paper", "Scissors", "Glue", "Ink", "Paper", "Marker", "Scissors"};

        HashSet<String> hash = new HashSet<>(List.of(orders));
        TreeSet<String> tree = new TreeSet<>(List.of(orders));

        System.out.println("Printing the hash set:");
        System.out.println(hash);

        System.out.println("Printing the tree set:");
        System.out.println(tree);
    }
}
