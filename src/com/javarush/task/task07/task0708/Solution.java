package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            int n = strings.get(i).length();
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            int n = strings.get(i).length();
            if (n == max) {
                s = strings.get(i);
                System.out.println(s);
            }
        }
    }
}
