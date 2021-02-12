package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
            if (list.get(i).length()<x) x = list.get(i).length();
        }
        for (int i = 0; i < 5; i++){
            if (list.get(i).length()==x) System.out.println(list.get(i));
        }

    }
}
