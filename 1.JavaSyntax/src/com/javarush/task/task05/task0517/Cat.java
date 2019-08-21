package com.javarush.task.task05.task0517;
public class Cat {

    public String name = "";
    public int age = 0;
    public int weight = 0;
    public String address = "";
    public String color = "";

    public Cat(String name){
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.address = null;
        this.color = "Черный";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
        this.color = "Черный";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.address = null;
        this.color = null;
    }

    public static void main(String[] args) {

    }
}
