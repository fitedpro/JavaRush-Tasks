package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();
        int minElementLength = 0;
        int countElementMinLength = 0;
        int countElementLengthCheck = 0;
        int countElementCheckInt = 0;

        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
            if (i == 0) {
                minElementLength = strings.get(i).length();
            }
            if (minElementLength > strings.get(i).length()) {
                countElementMinLength = i;
                countElementLengthCheck++;
            }
            if (minElementLength < strings.get(i).length()) {
                minElementLength = strings.get(i).length();
            }

            if (countElementLengthCheck == 1) {
                countElementCheckInt = countElementMinLength;
            }
        }

        if (countElementCheckInt != 0) {
            System.out.println(countElementCheckInt);
        }

    }
}


