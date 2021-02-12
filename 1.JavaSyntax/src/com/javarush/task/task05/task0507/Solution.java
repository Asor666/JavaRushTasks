package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        double sum = 0;
        double l = 0;
        while (true) {
            double x = Double.parseDouble(rd.readLine());
            sum +=x;
            l++;
            if (x==-1)
                break;

        }
        System.out.print((sum+1)/(l-1));
    }
}

