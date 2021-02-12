package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Jobs", "Jack");
        map.put("Ler", "John");
        map.put("Xel", "Jack");
        map.put("Ho", "Alex");
        map.put("Lee", "Bruce");
        map.put("Ny", "Jack");
        map.put("Cer", "Olga");
        map.put("Nor", "Fred");
        map.put("Ger", "Jack");
        map.put("Sokolov", "Ivan");
        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String,String> copy = new HashMap<>(map);
        Set<String> set = new HashSet<>();
        for (String name: copy.values()){
            if (!set.add(name)) removeItemFromMapByValue(map,name);
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        //Map<String, String> map = createMap();
        //removeTheFirstNameDuplicates(map);
       // for (Map.Entry<String, String> pair : map.entrySet()){
           // System.out.println(pair.getValue());
        //}



    }
}
