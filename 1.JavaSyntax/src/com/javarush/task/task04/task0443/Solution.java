package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        String name = rd.readLine();
        String y = rd.readLine();
        String m = rd.readLine();
        String d = rd.readLine();
        System.out.println("Меня зовут " + name +".");
        System.out.print("Я родился "+d+"."+m+"."+y);


    }
}
