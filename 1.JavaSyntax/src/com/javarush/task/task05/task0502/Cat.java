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
        int countThisCat = 0;
        int countAnotherCat = 0;
        if (this.age > anotherCat.age) {
            countThisCat++;
        } else if (this.age < anotherCat.age) {
            countAnotherCat++;
        }
        if (this.weight > anotherCat.weight) {
            countThisCat++;
        }  else if (this.weight < anotherCat.weight) {
            countAnotherCat++;
        }

        if (this.strength > anotherCat.strength) {
            countThisCat++;
        } else if (this.strength < anotherCat.strength) {
            countAnotherCat++;
        }

        if (countThisCat == countAnotherCat) {
            return false;
        } else if (countThisCat > countAnotherCat ){
            return true;
        } else if (countThisCat < countAnotherCat) {
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
