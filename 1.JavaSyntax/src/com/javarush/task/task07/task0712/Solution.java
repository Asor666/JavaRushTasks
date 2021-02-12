package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
            if (list.get(i).length()>x) x = list.get(i).length();
            if (list.get(i).length()<y) y = list.get(i).length();
        }
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).length()==x){
                System.out.println(list.get(i));
                break;
            }
            else if (list.get(i).length()==y){
                System.out.println(list.get(i));
                break;
            }

            }

    }
}
