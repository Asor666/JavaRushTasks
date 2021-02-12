package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String> ();
        for (int i = 0; i<10;i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String s:result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = list.size()-1; i>=0;i--){
            String s = list.get(i);
            list.add(i,s);
        }
        return list;
    }
}
