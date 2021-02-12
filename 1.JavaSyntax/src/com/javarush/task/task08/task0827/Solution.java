package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH); //создаем формат Date
        Calendar calendar = Calendar.getInstance(); //создаем Calendar
        calendar.setTime(dateFormat.parse(date)); //задаем Calendar дату спаршенную с String
        if (calendar.get(Calendar.DAY_OF_YEAR)%2==0){  //если день с начала года DAY_OF_YEAR четный то возвращаем false
            return false;
        }
        else                                           //если не четный то true
        return true;
    }
}
