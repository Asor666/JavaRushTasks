package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandma,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            String res = "The cat's name is " + name;
            if (parent == null) {
                res += ", no mother ";
            } else {
                res += ", mother is " + parent.name;
            }
            if (parent2 == null) {
                res += ", no father";
            } else {
                res += ", father is " + parent2.name;
            }
            return res;
        }


    }

}
