package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Terran prokin = new Terran();
        prokin.name = "Alex Prokin";
        Terran bakharev = new Terran();
        bakharev.name = "Alex Bakharev";
        Terran fitedpro = new Terran();
        fitedpro.name = "Alex";
        Terran FaceLess = new Terran();
        FaceLess.name = "fitedpro";

        Zerg Balrog = new Zerg();
        Balrog.name = "Balrog";
        Zerg Fenris = new Zerg();
        Fenris.name = "Fenris";
        Zerg Garm = new Zerg();
        Garm.name = "Garm";
        Zerg Jörmungand = new Zerg();
        Jörmungand.name = "Jörmungand";
        Zerg Tiamat = new Zerg();
        Tiamat.name = "Tiamat";

        Protoss Shellac = new Protoss();
        Shellac.name = "Shellac";
        Protoss Ara = new Protoss();
        Ara.name = "Ara";
        Protoss Auriga = new Protoss();
        Auriga.name = "Auriga";
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
