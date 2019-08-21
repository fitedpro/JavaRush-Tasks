package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int quarterNumber (int oX, int oY){
        if ((oX > 0) && (oY > 0)) {
            return 1;
        } else if ((oX < 0) && (oY > 0)) {
            return 2;
        } else if ((oX < 0) && (oY < 0)) {
            return 3;
        } else if ((oX > 0) && (oY < 0)) {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(quarterNumber(a, b));


    }
}
