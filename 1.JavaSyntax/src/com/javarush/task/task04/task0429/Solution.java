package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            reader.close();

            int discretePlus = 0;
            int discreteMinus = 0;

            if (a > 0) {
                discretePlus++;
            } else if (a < 0) {
                discreteMinus++;
            }
            if (b > 0) {
                discretePlus++;
            } else if (b < 0) {
                discreteMinus++;
            }
            if (c > 0) {
                discretePlus++;
            } else if (c < 0) {
                discreteMinus++;
            }

            System.out.println("количество положительных чисел: " + discretePlus);
            System.out.println("количество отрицательных чисел: " + discreteMinus);

        }
}
