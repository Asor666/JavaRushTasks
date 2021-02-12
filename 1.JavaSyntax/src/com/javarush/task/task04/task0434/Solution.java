package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        while (n<11){
            int i = 1;
            while (i<11){
                System.out.print(n*i + " ");
                i++;
            }
            n++;
            System.out.println();
        }

    }
}
