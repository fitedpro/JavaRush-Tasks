package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        }
        else if (b > a){
            max = b;
        }
        else if (a == b){
            max = a;
        }
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int maxF = 0;
        maxF = max(a, b);
        maxF = max(maxF, c);
        maxF = max(maxF, d);
        return maxF;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(max(a, b, c, d));
    }



}
