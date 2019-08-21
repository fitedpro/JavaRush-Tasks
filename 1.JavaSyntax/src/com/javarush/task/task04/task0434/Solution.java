package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                int solution = i * j;
                System.out.print(solution + " ");
                if (j == 10) {
                    System.out.println();
                }
                j++;
            }
            i++;
        }
    }
}
