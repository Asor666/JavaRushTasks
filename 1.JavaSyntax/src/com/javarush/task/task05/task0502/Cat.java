package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int vp = 0;
        int cp = 0;
        if (this.age > anotherCat.age){
            vp++;
        }
        else if (this.age < anotherCat.age) {
            cp++;
        }
        if (this.weight>anotherCat.weight){
            vp++;
        }
        else if (this.weight<anotherCat.weight) {
            cp++;
        }
        if (this.strength >anotherCat.strength){
            vp++;
        }
        else if (this.strength < anotherCat.strength) {
            cp++;
        }
        return vp>cp;


    }

    public static void main(String[] args) {
        Cat vaska = new Cat();
        vaska.age = 5;
        vaska.weight = 2500;
        vaska.strength = 75;
        Cat cat2 = new Cat();
        cat2.age = 5;
        cat2.weight = 2500;
        cat2.strength = 65;
        System.out.print(vaska.fight(cat2));


    }
}
