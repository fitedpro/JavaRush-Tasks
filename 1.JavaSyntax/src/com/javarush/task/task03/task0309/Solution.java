package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
        public static void main(String[] args) {
            int solution = 0;
            for (int i = 1; i <= 5; i++){
                solution += i;
                System.out.println(solution);
            }
        }
}
