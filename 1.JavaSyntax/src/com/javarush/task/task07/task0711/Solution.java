package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            strings.add(scanner.nextLine());
        }
        scanner.close();

        String s = "";
        for (int i = 0; i < 13; i++) {
            s = strings.get(4);
            strings.remove(4);
            strings.add(0, s);
        }

        for (String str: strings) {
            System.out.println(str);
        }
    }
}
