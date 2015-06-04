package com.my;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Hello!");
        list.add("Hi!");
        list.add("Good Morning!");
        list.add("Good Night!");
        list.add("Good Afternoon!");

        String str = list.get(2);
        System.out.println("Treti Obect = " + str);


        String[] array = {"One", "Two", "Three", "Four", "Five"};

        for (int k = 0; k < list.size(); k++) {

            System.out.println(list.get(k));

        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }

    }
}

