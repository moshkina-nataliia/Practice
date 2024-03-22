package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int cur = 0;
        for (int i = 0; i < list.size(); i++) {
            int stringLenth = list.get(i).length();
            if (stringLenth >= cur) {
                cur = stringLenth;
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}