package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Александр Прокин", 19);
    }

    static class Person {
        public Person() {
        }

        public String name = "";
     public int age = 0;

     public void initialize(String name, int age) {
         this.name = name;
         this.age = age;
     }
    }
}
