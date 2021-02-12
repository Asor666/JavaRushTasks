package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<20; i++){
            set.add(i);
        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> temp = new HashSet<>();
        for (int tmp: set){
            if (tmp>10) temp.add(tmp);
        }
        set.removeAll(temp);
        return set;

    }

    public static void main(String[] args) {

    }
}
