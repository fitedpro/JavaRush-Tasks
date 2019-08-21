package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {

    public String name = "";
    public int age = 0;
    public char sex = 0;

    public Friend(String name){
        this.name = name;
    }

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public static void main(String[] args) {

    }
}
