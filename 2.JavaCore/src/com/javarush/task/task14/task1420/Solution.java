package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
            if(x <= 0) throw new Exception();
        int y = Integer.parseInt(reader.readLine());
            if(y <= 0) throw new Exception();
        int z;
        int nod = 1;

        if (x>=y) z = y;
        else z =x;

        for(int i = z;i>0;i--){
            if ((x%i==0) && (y%i==0)){
                nod = i;
                System.out.println(nod);
                break;
            }
        }
    }
}
