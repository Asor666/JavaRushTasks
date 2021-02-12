package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int x = Integer.parseInt(a);
        String b = reader.readLine();
        int y = Integer.parseInt(b);
        System.out.println(x<y ? x: x>y ? y: x);


    }
}