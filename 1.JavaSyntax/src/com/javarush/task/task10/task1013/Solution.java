package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private char sex;
        private String name;
        private int height;
        private int weight;
        private String specialization;

        public Human(String name) {
            this.name = name;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(int age, char sex, String name) {
            this.age = age;
            this.sex = sex;
            this.name = name;
        }

        public Human(char sex, String name) {
            this.sex = sex;
            this.name = name;
        }

        public Human(int age, char sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, char sex, String name, int height) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.height = height;
        }

        public Human(int age, char sex, String name, int height, int weight) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, char sex, String name, int height, int weight, String specialization) {
            this.age = age;
            this.sex = sex;
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.specialization = specialization;
        }

        public Human(int weight, String specialization) {
            this.weight = weight;
            this.specialization = specialization;
        }

        public Human(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}
