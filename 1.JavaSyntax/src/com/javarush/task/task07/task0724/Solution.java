package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        Human Oleg = new Human("Олег", true,40);
        Human Olga = new Human("Ольга", false,37);
        Human Pavel = new Human("Павел", true,33);
        Human Rita = new Human("Рита", false,26);
        Human Lena = new Human("Лена",false,18, Oleg, Olga);
        Human Lina = new Human("Лина",false,14, Oleg, Olga);
        Human Leha = new Human("Леха",true,12, Oleg, Olga);
        Human Liza = new Human("Лиза",false,4, Pavel, Rita);
        Human Rex = new Human("Рекс",true,2, Pavel, Rita);
        Human[] data ={Oleg,Olga,Pavel,Rita,Lena,Lina,Leha,Liza,Rex};
        for (Human x:data){
            System.out.println(x);
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}