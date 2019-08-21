package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int hungred = number / 100;
        number = number - hungred * 100;
        if (number != 0){
            int ten = number / 10;
            number = number - ten * 10;
            number = number + ten + hungred;
            return number;
        }
        else {
            return hungred;
        }
    }
}