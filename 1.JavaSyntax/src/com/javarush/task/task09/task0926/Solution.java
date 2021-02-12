package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] a = {1,2,3,4,5};
        int[] b = {32,22};
        int[] c = {12,13,14,15};
        int[] d = {9,99,999,1,2,3,4};
        int[] e = new int[0];
        ArrayList<int[]> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);



        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
