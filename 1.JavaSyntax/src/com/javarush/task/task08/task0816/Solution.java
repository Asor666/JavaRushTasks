package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("AUGUST 2 2002"));
        map.put("Петров", dateFormat.parse("JULY 3 1989"));
        map.put("Гадина", dateFormat.parse("MAY 4 2000"));
        map.put("Хуй", dateFormat.parse("DECEMBER 5 1999"));
        map.put("Пенис", dateFormat.parse("MARCH 6 2020"));
        map.put("Манда", dateFormat.parse("APRIL 7 2012"));
        map.put("Гавно", dateFormat.parse("JULY 8 2012"));
        map.put("Омонпетухи", dateFormat.parse("JULY 9 2012"));
        map.put("Ментыпидары", dateFormat.parse("JULY 10 2012"));

        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> ws = new HashMap<>(map);
        for (Map.Entry<String,Date> pair: ws.entrySet()){
            if (pair.getValue().getMonth()>4 && pair.getValue().getMonth()<8 ) map.remove(pair.getKey());   //превращаем value date в номер месяца при помощи get.Month() и удаляем из мапы все летние месяцы
        }

    }

    public static void main(String[] args) throws ParseException {
//        Map<String,Date> map = createMap();
//        removeAllSummerPeople(map);
//        for (Map.Entry<String,Date> pair: map.entrySet()){
//            System.out.println(pair.getKey() + " "+ pair.getValue());
//        }

    }
}
