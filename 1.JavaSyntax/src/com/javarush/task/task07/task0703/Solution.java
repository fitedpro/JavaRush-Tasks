package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrInt = new int[10];
        String[] arrString = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = reader.readLine();
        }

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = arrString[i].length();
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }
    }
}
