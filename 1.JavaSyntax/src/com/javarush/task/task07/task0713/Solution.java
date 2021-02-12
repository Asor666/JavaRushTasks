package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer> ();
        ArrayList<Integer> three = new ArrayList<Integer> ();
        ArrayList<Integer> two = new ArrayList<Integer> ();
        ArrayList<Integer> another = new ArrayList<Integer> ();
        for (int i = 0; i < 20; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x%3==0)
                three.add(x);
            if (x%2==0)
                two.add(x);
            if (x%2!=0&&x%3!=0)
                another.add(x);
        }
        printList(three);
        printList(two);
        printList(another);

    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer x:list){
            System.out.println(x);
        }
    }
}
