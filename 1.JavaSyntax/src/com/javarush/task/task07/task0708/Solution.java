package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
            if (strings.get(i).length()>x) x = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++){
            if (strings.get(i).length()==x) System.out.println(strings.get(i));
        }
    }
}
