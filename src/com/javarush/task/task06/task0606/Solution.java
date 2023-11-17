package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberS = reader.readLine();
        int number = Integer.parseInt(numberS);
        int lengthNumber = numberS.length();
        int x;
        for (int i = 0; i < lengthNumber; i++) {
            x = number % 10;
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number = number / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}