package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        double x = Double.parseDouble(a);
        if (x%5<3){
            System.out.println("зелёный");
        }
        else if (3<=x%5 && x%5<4){
            System.out.println("жёлтый");
        }
        else if (x%5>=4 && x%5<5){
            System.out.println("красный");
        }

    }
}