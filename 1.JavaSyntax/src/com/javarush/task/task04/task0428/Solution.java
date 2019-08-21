package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int discrete = 0;
        if (a > 0) {
            discrete++;
        }
        if (b > 0) {
            discrete++;
        }
        if (c > 0) {
            discrete++;
        }

        System.out.println(discrete);

    }
}
