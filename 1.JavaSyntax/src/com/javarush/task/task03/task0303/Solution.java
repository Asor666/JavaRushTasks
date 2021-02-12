package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(123,1.17));
        System.out.println(convertEurToUsd(1134,1.17));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur*exchangeRate;

    }
}
