package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        System.out.println(x%2==0 && x<0? "отрицательное четное число": x%2!=0 && x<0? "отрицательное нечетное число": x==0? "ноль": x%2==0 && x>0? "положительное четное число": "положительное нечетное число");

    }
}
