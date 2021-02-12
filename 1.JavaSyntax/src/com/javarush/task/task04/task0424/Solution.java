package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        String n2 = reader.readLine();
        int y = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int z = Integer.parseInt(n3);
        if (x==y)
        System.out.println(3);
        else if (y==z)
            System.out.println(1);
        else if (x==z)
            System.out.println(2);




    }
}
