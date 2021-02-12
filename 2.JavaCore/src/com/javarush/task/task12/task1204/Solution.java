package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String s = o.getClass().getSimpleName();
        if (s.equals("Cat")) System.out.println("Кошка");
        if (s.equals("Bird")) System.out.println("Птица");
        if (s.equals("Lamp")) System.out.println("Лампа");
        if (s.equals("Dog")) System.out.println("Собака");
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
