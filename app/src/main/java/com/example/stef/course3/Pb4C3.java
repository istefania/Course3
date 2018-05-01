package com.example.stef.course3;

import java.util.ArrayList;

public class Pb4C3 {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("this");
        listOfStrings.add("is");
        listOfStrings.add("lots");
        listOfStrings.add("of");
        listOfStrings.add("fun");
        listOfStrings.add("for");
        listOfStrings.add("every");
        listOfStrings.add("Java");
        listOfStrings.add("programmer");

        markLength4(listOfStrings);
        System.out.println(listOfStrings);

    }

    static void markLength4(ArrayList<String> list) {
        int listSize = list.size();
        for (int i = 0; i < listSize; ++i) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
                listSize++;
            }
        }
    }
}
