package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int countMinStringLenght = 0;
        int minStringLenght = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
            if (i == 0) {
               minStringLenght = strings.get(i).length();
            }

            if (minStringLenght > strings.get(i).length()) {
                minStringLenght = strings.get(i).length();
                countMinStringLenght = i;
            }
        }
        sc.close();

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == strings.get(countMinStringLenght).length()) {
                System.out.println(strings.get(i));
            }
        }

    }
}
