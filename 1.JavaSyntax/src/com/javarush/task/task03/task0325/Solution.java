package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int salary = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println("Я буду зарабатывать $" + salary + " в час");
    }
}
