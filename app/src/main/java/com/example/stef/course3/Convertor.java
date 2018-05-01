package com.example.stef.course3;

import java.util.ArrayList;
import java.util.Arrays;

public class Convertor {

    public static void main(String[] args) {
        String[] array = new String[]{"C", "Java", "Python", "C#", "C++", "Perl"};
        ArrayList newList = new ArrayList<>(Arrays.asList(array));

        switchPairs(newList);
        System.out.println(newList);

        newList.add(0, "ASM");
        switchPairs(newList);
        System.out.println(newList);
    }

    static void switchPairs(ArrayList<String> list) {
        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i += 2) {
                list.add(i + 2, list.get(i));
                list.remove(i);
            }

        } else {

            for (int i = 1; i < list.size(); i += 2) {
                list.add(i + 2, list.get(i));
                list.remove(i);
            }

        }


    }
}