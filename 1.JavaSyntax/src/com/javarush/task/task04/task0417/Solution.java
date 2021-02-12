package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int x = Integer.parseInt(a);
        String b = reader.readLine();
        int y = Integer.parseInt(b);
        String c = reader.readLine();
        int z = Integer.parseInt(c);
        if (x==y && y==z){
            System.out.println(a+" "+b+" "+c);
        }
        else if (x==y){
            System.out.println(a + " " + b);
        }
        else if (y==z){
            System.out.println(b + " " + c);
        }
        else if (x==z){
            System.out.println(c + " " + a);
        }

    }
}