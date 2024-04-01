package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int countMax = 1;
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i);
            int b = list.get(i - 1);
            boolean n = a == b;
            if (n) {
                count = count + 1;
                if (count >= countMax) {
                    countMax = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(countMax);
    }
}