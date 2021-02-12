package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,"мама","мыла","раму");
        for (int i =0; i<list.size();i=i+2) {
            list.add(i+1, "именно");
        }
        for (String x:list)
        {
            System.out.println(x);
        }
    }
}
