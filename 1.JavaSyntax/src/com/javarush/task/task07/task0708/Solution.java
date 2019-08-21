package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        int biggestLineSize = strings.get(0).length();
        int countBiggestLine = 0;
        int countRepeatBiggestLine = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (biggestLineSize < strings.get(i).length()) {
                biggestLineSize = strings.get(i).length();
                countBiggestLine = i;
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (biggestLineSize == strings.get(i).length()) {
                System.out.println(strings.get(i));
                countRepeatBiggestLine++;
            }
        }

        if (countRepeatBiggestLine == 0) {
            System.out.println(strings.get(countBiggestLine));
        }

    }
}
