package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.2,"dssd");
        labels.put(1.3,"dssqd");
        labels.put(1.4,"ww");
        labels.put(1.5,"d3ssd");
        labels.put(1.7,"dss2d");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}