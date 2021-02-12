package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        while (n<=10){
            int i = 1;
            while (i<=10){
                System.out.print(n*i + " ");
                i++;
            }
            System.out.println();
            n++;
        }

    }
}
