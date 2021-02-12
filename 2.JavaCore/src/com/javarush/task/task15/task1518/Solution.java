package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

import java.sql.SQLOutput;

public class Solution {
    public static Cat cat;

    public static class Cat{
        public String name;
    }
    static { cat = new Cat();
        System.out.println(cat.name = "sd");
    }

    public static void main(String[] args) {

    }
}
