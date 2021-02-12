package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        URL aURL = new URL(reader.readLine());
        String url = aURL.getQuery();
        String[] words = url.split("&");
        for (String x: words){
            System.out.print(x.replaceAll("=.*$","")+" ");
        }
        System.out.println();
        for (String x: words){
            if (x.contains("obj")){
                try {
                    alert(Double.parseDouble(x.replaceAll("obj=","")));
                } catch (NumberFormatException e) {
                    alert(x.replaceAll("obj=",""));
                }
            }

        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
