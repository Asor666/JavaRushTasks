package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        InputStream inputStream = new FileInputStream(s);
        BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<Integer> list = new ArrayList<>();
        while (rd.ready()){
            int x = Integer.parseInt(rd.readLine());
            if (x%2==0) list.add(x);
        }
        rd.close();
        inputStream.close();
        Collections.sort(list);
        list.forEach(y-> System.out.println(y));

    }
}
