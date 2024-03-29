package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strings.size(); i++) {
            int stringLength = strings.get(i).length();
            if (stringLength < minLength) {
                minLength = stringLength;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            int stringLength = strings.get(i).length();
            if (stringLength == minLength) {
                System.out.println(strings.get(i));
            }
        }
    }
}