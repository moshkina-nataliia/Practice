package com.javarush.task.task07.task0707;

import java.sql.SQLOutput;
import java.util.ArrayList;

/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Denis");
        list.add("Natasha");
        list.add("Konstantin");
        list.add("Anton");
        list.add("Ludmila");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}





























