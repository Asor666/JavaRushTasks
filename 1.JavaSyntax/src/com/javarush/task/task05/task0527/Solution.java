package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom","Russian Blue Cat",6);
        Dog spikeDog = new Dog("Spike", "Bulldog", 6);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        String kind;
        int age;

        public Cat(String name, String kind, int age) {
            this.name = name;
            this.kind = kind;
            this.age = age;
        }
    }

    public static class Dog {
        String name;
        String kind;
        int age;

        public Dog(String name, String kind, int age) {
            this.name = name;
            this.kind = kind;
            this.age = age;
        }
    }
}
