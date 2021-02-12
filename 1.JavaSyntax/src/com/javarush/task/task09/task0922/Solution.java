package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = dateFormat.parse(d);
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(dateFormat1.format(date).toUpperCase());

    }
}
