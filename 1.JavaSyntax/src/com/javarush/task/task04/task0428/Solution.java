package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int x = Integer.parseInt(n);
        String n2 = reader.readLine();
        int y = Integer.parseInt(n2);
        String n3 = reader.readLine();
        int z = Integer.parseInt(n3);

        if (x>0 && y>0 && z>0)
            System.out.println(3);
        else if ((x>0 && y<=0 && z>0)||(x<=0 && y>0 && z>0)||(x>0 && y>0 && z<=0))
            System.out.println(2);
        else if ((x>0 && y<=0 && z<=0)||(x<=0 && y>0 && z<=0)||(x<=0 && y<=0 && z>0))
            System.out.println(1);
        else if (x<=0 && y<=0 && z<=0)
            System.out.println(0);







    }
}
