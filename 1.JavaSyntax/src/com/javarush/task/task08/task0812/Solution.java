package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Map<Integer, Integer> count = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10;i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int max = 1;
        for(int i = 0; i<list.size();i++){
            int tmp = 1;
            for(int j = i; j<list.size()-1;j++){
                if(list.get(i).equals(list.get(j+1))) tmp++;
                else break;
            }
            if (tmp>max) max = tmp;

        }

            System.out.println(max);


    }
}
