package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }


        for (int i = 0; i < numbers.length; i++) {
            if ((i % 2) == 0) {
                countEven += numbers[i];
            }
            else if ((i % 2) != 0) {
                countOdd += numbers[i];
            }
        }

        if (countEven > countOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        if (countOdd > countEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }


    }
}
