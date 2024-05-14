package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Анна", false, 21);
        Human human2 = new Human("Катя", false, 55);
        Human human3 = new Human("Максим", true, 60);
        Human human4 = new Human("Павел", true, 45);
        Human human5 = new Human("Игорь", true, 17, human3, human1);
        Human human6 = new Human("Олеся", false, 10, human3, human1);
        Human human7 = new Human("Петя", true, 22, human2, human4);
        Human human8 = new Human("Вера", false, 2, human2, human4);
        Human human9 = new Human("Костя", true, 12, human2, human4);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}