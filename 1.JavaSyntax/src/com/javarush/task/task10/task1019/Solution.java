package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> mapa = new HashMap<String, Integer>();
        while (true){
            int id = 0;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }
            String name = reader.readLine();
            mapa.put(name,id);

        }
        for(Map.Entry<String,Integer> x:mapa.entrySet()){
            System.out.println(x.getValue() + " " + x.getKey());
        }

    }
}
