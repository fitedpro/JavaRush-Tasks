package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double solution = i * 0.1;
        solution = i + solution;
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
