package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик",5,2000,80);
        Cat cat1 = new Cat("Мурзик", 9,3000,48);
        Cat cat2 = new Cat("Марсик",3,3800,90);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}