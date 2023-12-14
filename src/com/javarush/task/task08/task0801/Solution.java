package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/*
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> vegetables = new HashSet<>();

        vegetables.add("арбуз");
        vegetables.add("банан");
        vegetables.add("вишня");
        vegetables.add("груша");
        vegetables.add("дыня");
        vegetables.add("ежевика");
        vegetables.add("женьшень");
        vegetables.add("земляника");
        vegetables.add("ирис");
        vegetables.add("картофель");

        Iterator<String> iterator = vegetables.iterator();

        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}