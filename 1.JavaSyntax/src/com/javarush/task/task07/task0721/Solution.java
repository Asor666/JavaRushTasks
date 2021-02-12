package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;
        int[] list = new int[20];
        list = getInts();
        maximum = list[0];
        minimum = maximum;
        for (int i = 0; i<list.length; i++){
            if (list[i]>maximum) maximum=list[i];
            else if(list[i]<minimum) minimum = list[i];
        }


        System.out.print(maximum + " " + minimum);
    }

    public  static int[] getInts() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list1 = new int[20];
        for (int i =0; i<list1.length; i++){
            list1[i]= Integer.parseInt(reader.readLine());
        }
        return list1;

    }
}
