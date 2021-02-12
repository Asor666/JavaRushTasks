package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String bif = reader.readLine();
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(bif))) {
                String line;
                while (!(line= read.readLine()).equals("exit")) {
                    writer.write(line);
                    writer.newLine();
                }
                writer.write("exit");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
