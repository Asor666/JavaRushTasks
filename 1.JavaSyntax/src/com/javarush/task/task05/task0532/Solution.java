package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int x = Integer.parseInt(reader.readLine());
        if (x<0){
            return;
        }
        int numbers[]=new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= Integer.parseInt(reader.readLine());
            if(numbers[i] > maximum)
                maximum = numbers[i];
        }

        if (x>0)
        System.out.println(maximum);
    }
}
