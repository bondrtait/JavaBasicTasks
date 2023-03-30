package com.ct.vlevy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 1. Написать метод, который принимает 2 параметра
// - List<String> values
// - String pattern
// возвращает List<String> которые матчатся на паттерн
// 2. Создать List<String> (валидных и невалидных значений) и Паттерг для валидации следующих значений - e-mail
// 3. Вывести на экран только валидные значения с задания 2, используя метод с задания 1

public class Regex {
    public static void main(String[] args) {
        List<String> emails = List.of("valid.email@kadj-ada.cca", "two..dotsin@row.xom",
                "hyphen.first.letter@-in-domain.asd", "dot.last.letter.in.@username.asd","Pelé@example.com","δοκιμή@παράδειγμα.δοκιμή",
                "我買@屋企.香港","二ノ宮@黒川.日本", "слава@україні.юа", "validAGAIn@kkq----a.ckl",
                "email123.456789@kj33093.kkf");

        //this email regex cover international email addresses (most of the unicode symbols)
        //conforms with the rules on the allowed special characters
        // and their sequencing (e.g. two dots one by one are not allowed)
        //I've written this not long ago for the purposes of the assigned work project
        String emailPattern = "^(?:[\\w!#$%&'*+\\-/=?^_`{|}~]+(?:\\.[\\w!#$%&'*+\\-/=?^_`{|}~]+)*)@(?:(?:[\\w&&[^_]]" +
                "(?:[-\\w&&[^_]]*[\\w&&[^_]])?\\.)+[\\w&&[^_]](?:[-\\w&&[^_]]*[\\w&&[^_]])?)$";

        System.out.println(getMatchingValues(emails, emailPattern));
    }

    static List<String> getMatchingValues(List<String> values, String pattern) {
        List<String> matchingValues = new ArrayList<>();
        Pattern p = Pattern.compile(pattern, Pattern.UNICODE_CHARACTER_CLASS);

        for (String s : values) {
            Matcher matcher = p.matcher(s);

            if (matcher.matches()) {
                matchingValues.add(s);
            }
        }

        return matchingValues;
    }
}
