package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        String minStr = null;

        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MAX_VALUE;
        String maxStr = null;

        for (int i = strings.size() - 1; i >= 0; i--) {
            if (strings.get(i).length() <= min) {
                min = strings.get(i).length();
                minIndex = i;
                minStr = strings.get(i);
            }
        }

        for (int i = strings.size() - 1; i >= 0; i--) {
            if (strings.get(i).length() >= max) {
                max = strings.get(i).length();
                maxIndex = i;
                maxStr = strings.get(i);
            }
        }

        if (maxIndex < minIndex) {
            System.out.println(maxStr);
        } else {
            System.out.println(minStr);
        }
    }
}