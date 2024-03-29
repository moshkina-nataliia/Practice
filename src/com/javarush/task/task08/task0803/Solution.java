package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/*
Коллекция Map из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map2 = new HashMap<String, Cat>();
        for (int i =0; i<cats.length; i++) {
            String name = cats[i];
            Cat cat1 = new Cat(cats[i]);
            map2.put(name, cat1);

        }
        return map2;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }}