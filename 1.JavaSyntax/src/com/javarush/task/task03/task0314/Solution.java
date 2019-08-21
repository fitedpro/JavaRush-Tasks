package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                int sol = i * j;
                System.out.print(sol + " ");
                if (j == 10) {
                    System.out.println();
                }
            }
        }
    }
}
