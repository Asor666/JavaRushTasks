package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i< array.length; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        boolean isSort = false;
        while (!isSort){
            isSort = true;
            for (int i =1;i< array.length;i++){
                if (array[i]<array[i-1]){
                    int temp = array[i];
                    array[i]=array[i-1];
                    array[i-1]=temp;
                    isSort = false;
                }
            }
        }

        for (int x: array){
            System.out.println(x);
        }
    }
}
