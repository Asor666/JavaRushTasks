package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        System.out.println(x==1 ? "понедельник": x==2 ? "вторник": x==3 ? "среда": x==4 ? "четверг": x==5 ? "пятница": x==6 ? "суббота": x==7 ? "воскресенье": "такого дня недели не существует");

    }
}