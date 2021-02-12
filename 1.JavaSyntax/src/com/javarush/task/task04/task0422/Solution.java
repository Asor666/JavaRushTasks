package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String y = reader.readLine();
        int x = Integer.parseInt(y);
        if (x<18)
            System.out.println("Подрасти еще");


    }
}
