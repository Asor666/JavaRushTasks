package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (String x:array){
            if(isNumber(x)) numbers.add(Integer.parseInt(x));
            else strings.add(x);
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);

        boolean isSorted;
        for (int i = 0; i<strings.size()-1;i++) {
            isSorted = true;
            for (int j = 0; j<(strings.size()-1)-i;j++){
                if (isGreaterThan(strings.get(j),strings.get(j+1))){
                    Collections.swap(strings,j,j+1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }

        for(int i =0;i<array.length;i++){
            if (isNumber(array[i])) {
                array[i] = numbers.get(0)+"";
                numbers.remove(0);
            }
            else  {
                array[i] = strings.get(0);
                strings.remove(0);
            }

        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
