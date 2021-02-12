package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }


    public static void main(String[] args) {

        for (Thread x:threads){
            x.start();
        }
    }
    public static class FirstThread extends Thread{
        public void run(){

            while (Thread.currentThread().isAlive()){

            }
        }
    }
    public static class SecondThread extends Thread{
        public void run(){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThirdThread extends Thread{
        public void run(){
            try {
                while (currentThread().isAlive()){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class FourthThread extends Thread implements Message{
        public void run(){
            while (!this.isInterrupted()){

            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class FifthThread extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int count = 0;
            try {
                while (true){
                    if ((line = reader.readLine()).equals("N")) break;
                    else count+=Integer.parseInt(line);
                }
            } catch (IOException e) {
                System.out.println(count);
            }
            System.out.println(count);

        }



    }
}