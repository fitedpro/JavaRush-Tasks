package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if ((a == b) && (b == c) &&(a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if(a == c) {
            System.out.println(a + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        }
    }
}