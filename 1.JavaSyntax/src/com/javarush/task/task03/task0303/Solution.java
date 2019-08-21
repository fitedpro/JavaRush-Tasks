package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(50, 1.12));
        System.out.println(convertEurToUsd(124, 1.12));
    }

    public static double convertEurToUsd(int eur, double course) {
        course = eur * course;
        return course;
    }
}
