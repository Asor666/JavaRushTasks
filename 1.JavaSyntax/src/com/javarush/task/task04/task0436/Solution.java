package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        String s1 = rd.readLine();
        String s2 = rd.readLine();
        for (int n = Integer.parseInt(s1); n>0; n--)
        {
            for (int m = Integer.parseInt(s2); m>0; m--)
            {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
