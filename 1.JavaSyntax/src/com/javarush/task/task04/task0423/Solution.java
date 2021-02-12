package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String y = reader.readLine();
        int x = Integer.parseInt(y);
        if (x>20)
            System.out.println("И 18-ти достаточно");

    }
}
