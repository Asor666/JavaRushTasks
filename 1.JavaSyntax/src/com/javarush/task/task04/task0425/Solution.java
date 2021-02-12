package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        String n2 = reader.readLine();
        int y = Integer.parseInt(n2);
        System.out.println(x>0 && y>0? 1: x<0 && y>0? 2: x<0 && y<0? 3: 4);

    }
}
