package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

//        ArrayList<String> resultStrings = new ArrayList<String>();
//        for (int i = 0; i < strings.size(); i++) {
//            String string = strings.get(i);
//            resultStrings.add(string.toUpperCase());
//        }
//
//        for (int i = 0; i < resultStrings.size(); i++) {
//            System.out.println(resultStrings.get(i));
//        }

        ArrayList<String> strings1 = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            int count = strings.get(i).length();
            strings1.add(strings.get(i));

            if (count % 2 == 0) {
                System.out.println(strings1.get(i) + " " + strings1.get(i));
            } else {
                System.out.println(strings1.get(i) + " " + strings1.get(i) + " " + strings1.get(i));
            }
        }

    }
}