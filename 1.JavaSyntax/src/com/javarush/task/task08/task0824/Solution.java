package com.javarush.task.task08.task0824;

import java.util.*;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human children1 = new Human("Ваня",true,25);
        Human children2 = new Human("Артур",true,22);
        Human children3 = new Human("Дуся",false,18);
        Human father = new Human("Игорь",true,50,new ArrayList<Human>(Arrays.asList(children1,children2,children3)));
        Human mother = new Human("Маша",false,45,new ArrayList<Human>(Arrays.asList(children1,children2,children3)));
        Human grandfather = new Human("Василий",true,80,new ArrayList<Human>(Arrays.asList(father)));
        Human grandfather1 = new Human("Иван",true,77,new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother = new Human("Лида",false,76,new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother1 = new Human("Клава",false,70,new ArrayList<Human>(Arrays.asList(mother)));
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this.toString());
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this.toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
