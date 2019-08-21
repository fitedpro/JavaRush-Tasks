package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Александр Прокин", 21, "2619 Yamada, Chichibu-shi, Saitama-ken 368-0004, Япония");
        Man man2 = new Man("Александр Бахарев", 21, "2619 Yamada, Chichibu-shi, Saitama-ken 368-0004, Япония");
        Woman woman = new Woman("Агата Кристи", 18, "29 Yamada, Chichibu-shi, Saitama-ken 367, Япония");
        Woman woman1 = new Woman("Харпер Ли", 999, "29 Yamada");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man {
        public String name = "";
        public int age = 0;
        public String address = "";

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        public String name = "";
        public int age = 0;
        public String address = "";

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
