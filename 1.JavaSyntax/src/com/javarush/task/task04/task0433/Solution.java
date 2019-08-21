package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print("S");
                if (j == 10) {
                    System.out.println();
                }
                j++;
            }
            i++;
        }
    }
}
