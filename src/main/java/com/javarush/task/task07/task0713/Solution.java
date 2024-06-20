package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listFor3 = new ArrayList<>();
        ArrayList<Integer> listFor2 = new ArrayList<>();
        ArrayList<Integer> listForAnother = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                listFor3.add(list.get(i));
                listFor2.add(list.get(i));
            } else if (list.get(i) % 3 == 0) {
                listFor3.add(list.get(i));
            } else if (list.get(i) % 2 == 0) {
                listFor2.add(list.get(i));
            } else {
                listForAnother.add(list.get(i));
            }
        }
        printList(listFor3);
        printList(listFor2);
        printList(listForAnother);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}