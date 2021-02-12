package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> pipls = new HashMap<>();
        pipls.put("qwe","aaaa");
        pipls.put("qwert","sss");
        pipls.put("qwe","ffff");
        pipls.put("asd","gggg");
        pipls.put("zxc","jkk");
        pipls.put("zxcz","kljj");
        pipls.put("ccc","oooo");
        pipls.put("czx","oooo");
        pipls.put("hjk","oooo");
        pipls.put("zxc","jkk");

        return pipls;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
