package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Иванов",500);
        map.put("Петров",600);
        map.put("Сидоров",499);
        map.put("Кузнецов",450);
        map.put("Петросян",780);
        map.put("Лось",654);
        map.put("Ковалев",654);
        map.put("Коваль",123);
        map.put("Михайлов",500);
        map.put("Пичугин",233);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String,Integer> copy = new HashMap<>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()){
            if(pair.getValue()<500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        Map<String, Integer> map = createMap();
//        removeItemFromMap(map);
//        for (HashMap.Entry<String, Integer> pair : map.entrySet()){
//            System.out.println(pair.getKey() +" " + pair.getValue());
//        }/*

    }
}