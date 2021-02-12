package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        if (x<10 && x%2==0 && x>0)
            System.out.println("четное однозначное число");
        else if (x<10 && x%2!=0 && x>0)
            System.out.println("нечетное однозначное число");
        else if (x<100 && x%2==0 && x>0)
            System.out.println("четное двузначное число");
        else if (x<100 && x%2!=0 && x>0)
            System.out.println("нечетное двузначное число");
        else if (x<1000 && x%2==0 && x>0)
            System.out.println("четное трехзначное число");
        else if (x<1000 && x%2!=0 && x>0)
            System.out.println("нечетное трехзначное число");





    }
}
