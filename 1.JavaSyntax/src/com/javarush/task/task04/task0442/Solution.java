package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        int sum = 0;
        while (true) {
            int x = Integer.parseInt(rd.readLine());
            sum +=x;
            if (x==-1)
                break;

        }
        System.out.print(sum);

    }
}
