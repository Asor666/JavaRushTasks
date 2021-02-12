package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog {
    String name;
    int age;

    public void setName (String name){
        this.name= name;
    }
    public String getName (){
        return name;
    }
    public void setAge (int age){
        this.age= age;
    }
    public int getAge (){
        return age;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader((new InputStreamReader(System.in)));
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(5);

    }
}
