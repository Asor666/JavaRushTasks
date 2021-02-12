package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        String a = rd.readLine();
        String b = rd.readLine();
        String c = rd.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        if (x==y || y==z || z==x)
        {
            if (x==y)
                System.out.print(x);
            else
                System.out.print(z);
        }
        else if ((x>y&&x<z)||(x<y&&x>z))
            System.out.print(x);
        else if ((y>x&&y<z)||(y<x&&y>z))
            System.out.print(y);
        else if ((z>x&&z<y)||(z<x&&z>y))
            System.out.print(z);




    }
}
