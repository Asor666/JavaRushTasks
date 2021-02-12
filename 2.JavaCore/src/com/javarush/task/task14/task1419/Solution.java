package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();


    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            System.out.println(exceptions.get(20));
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object i = Integer.valueOf(2);
            String s = (String)i;
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            Integer.parseInt(null);
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            Double.parseDouble(null);
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            int[] arr = new int[2];
            System.out.println(arr[3]);
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            int x = -2;
            int[] arr = new int[x];

        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            String x = "Мама";
            char b = x.charAt(5);
        } catch (Exception e){
            exceptions.add(e);
        }
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (Exception e){
            exceptions.add(e);
        }


    }

}
