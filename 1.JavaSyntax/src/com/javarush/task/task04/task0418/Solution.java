package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        reader.close();

        if (a < b) {
            System.out.println(a);
        } else if (b < a) {
            System.out.println(b);
        } else if(a == b){
            System.out.println(a);
        }
    }
}