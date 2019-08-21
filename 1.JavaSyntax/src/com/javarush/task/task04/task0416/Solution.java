package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    float minute = Float.parseFloat(reader.readLine()) % 5;
        if ((minute >= 0) && (minute <= 3f)) {
        System.out.println("зелёный");
    }
        else if ((minute >= 3f) && (minute < 4f)) {
        System.out.println("жёлтый");
    }
        else if ((minute >= 4f) && (minute < 5f)) {
        System.out.println("красный");
    }
    }
}