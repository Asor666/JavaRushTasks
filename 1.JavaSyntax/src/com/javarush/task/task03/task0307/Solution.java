package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zog = new Zerg();
        zog.name = "Zog";
        Zerg zug = new Zerg();
        zug.name = "Zug";
        Zerg zig = new Zerg();
        zig.name = "Zig";
        Zerg zag = new Zerg();
        zag.name = "Zag";
        Zerg zeg = new Zerg();
        zeg.name = "Zeg";
        Protoss pro = new Protoss();
        pro.name = "Pro";
        Protoss pri = new Protoss();
        pri.name = "Pri";
        Protoss pre = new Protoss();
        pre.name = "Pre";
        Terran jo = new Terran();
        jo.name = "Jo";
        Terran to = new Terran();
        to.name = "To";
        Terran ho = new Terran();
        ho.name = "Ho";
        Terran ko = new Terran();
        ko.name = "Ko";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
