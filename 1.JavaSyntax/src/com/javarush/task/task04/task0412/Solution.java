package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        if (x>=0){
            if (x==0)
                System.out.println(x);
            else
                System.out.println(x*2);
        }
        else
            System.out.println(x+1);




    }

}