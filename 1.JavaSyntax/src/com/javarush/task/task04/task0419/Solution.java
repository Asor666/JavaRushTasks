package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        String m = reader.readLine();
        int y = Integer.parseInt(m);
        String l = reader.readLine();
        int z = Integer.parseInt(l);
        String k = reader.readLine();
        int u = Integer.parseInt(k);
        int array[] = new int[]{x, y, z, u};
        int max = getMax(array);
        System.out.println(max);


    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }
}
