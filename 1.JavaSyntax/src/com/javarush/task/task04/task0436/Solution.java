package com.javarush.task.task04.task0436;

/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        reader.close();

        for (int i = 0; i < a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(8);
                if (j == b) {
                    System.out.println();
                }
            }
        }


    }
}
