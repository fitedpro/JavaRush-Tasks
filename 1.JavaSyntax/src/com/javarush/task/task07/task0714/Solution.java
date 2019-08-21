package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(sc.nextLine());
        }
        sc.close();

        strings.remove(2);

        for (int i = strings.size() - 1; i >= 0 ; i--) {
            System.out.println(strings.get(i));
        }

    }
}
