package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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
        if ((a == b) && (b == c) && (a == c)) {
            System.out.println(a);
        } else {
            if (a == b) {
                System.out.println(a);
            }
            if (b == c) {
                System.out.println(c);
            }
            if (a == c) {
                System.out.println(a);
            }

            if ((a > b) && (a < c)) {
                System.out.println(a);
            }

            if ((a > c) && (a < b)) {
                System.out.println(a);
            }

            if ((b > a) && (b < c)) {
                System.out.println(b);
            }

            if ((b > c) && (b < a)) {
                System.out.println(b);
            }

            if ((c > a) && (c < b)) {
                System.out.println(c);
            }

            if ((c > b) && (c < a)) {
                System.out.println(c);
            }
        }
    }
}
