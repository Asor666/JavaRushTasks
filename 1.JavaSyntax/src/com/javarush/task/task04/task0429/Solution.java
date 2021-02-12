package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int[] x = {a, b, c};

        int countNegative = 0;
        int countPositive = 0;
        for (int value : x) {
            if (value < 0) {
                countNegative++;
            } else if(value > 0) {
                countPositive++;
            }
        }
        System.out.println("количество отрицательных чисел: "+ countNegative);
        System.out.println("количество положительных чисел: "+ countPositive);

    }
}
