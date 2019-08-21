package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int maxStringLength = 0;
        int minStringLength = 0;
        int countMaxStringLength = 0;
        int countMinStringLength = 0;

        for (int i = 0; i < 10 ; i++) {
            strings.add(scanner.nextLine());
            if (i == 0) {
                maxStringLength = strings.get(i).length();
                minStringLength = strings.get(i).length();
            }

            if (minStringLength > strings.get(i).length()) {
                minStringLength = strings.get(i).length();
                countMinStringLength = i;
            }

            if (maxStringLength < strings.get(i).length()) {
                maxStringLength = strings.get(i).length();
                countMaxStringLength = i;
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxStringLength) {
                if (countMaxStringLength >  i) {
                    countMaxStringLength = i;
                }
            }

            if (strings.get(i).length() == minStringLength) {
                if (countMinStringLength >  i) {
                    countMinStringLength = i;
                }
            }
        }

        if (countMaxStringLength < countMinStringLength) {
            System.out.println(strings.get(countMaxStringLength));
        }
        if (countMinStringLength < countMaxStringLength) {
            System.out.println(strings.get(countMinStringLength));
        }

    }
}
