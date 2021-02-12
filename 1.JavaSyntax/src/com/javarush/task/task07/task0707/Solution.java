package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String s = "sdf";
        String x = "vv";
        String a = "bxz";
        String v = "AD";
        String n = "BBBN";
        list.add(s);
        list.add(x);
        list.add(a);
        list.add(v);
        list.add(n);
        System.out.println(list.size());
        for (int i=0; i < list.size();i++){
            System.out.println( list.get(i) );
        }



    }
}
