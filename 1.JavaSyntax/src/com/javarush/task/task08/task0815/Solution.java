package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Путин", "Владимир");
        map.put("Фурсенко", "Андрей");
        map.put("Фурсенко ", "Сергей");
        map.put("Якунин", "Владимир");
        map.put("Медведев ", "Дмитрий");
        map.put("Шамалов", "Николай");
        map.put("Чубайс", "Анатолий");
        map.put("Смирнов", "Владимир");
        map.put("Ковальчук", "Юрий");
        map.put("Мячин", "Виктор");
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String firstname:map.values())
        {
            if (firstname.equals(name)) count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastname:map.keySet())
        {
            if (lastname.equals(lastName)) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Владимир"));
        System.out.println(getCountTheSameLastName(map, "Фурсенко"));
    }

    }

