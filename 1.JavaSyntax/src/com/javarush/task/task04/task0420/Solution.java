package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
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
        if (x>=y && y>=z) {
            System.out.println(x + " " + y + " " + z);
        }
        else if (y>=x && x>=z){
            System.out.println(y + " " + x + " " + z);
        }
        else if (z>=x && x>=y){
            System.out.println(z + " " + x + " " + y);
        }
        else if (y>=z && z>=x){
            System.out.println(y + " " + z + " " + x);
        }
        else if (x>=z && z>=y){
            System.out.println(x + " " + z + " " + y);
        }
        else if (z>=y && y>=x){
            System.out.println(z + " " + y + " " + x);
        }






    }
}
