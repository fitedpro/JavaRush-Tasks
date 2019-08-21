package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String salary = reader.readLine();
        int nSalary = Integer.parseInt(salary);
        String year = reader.readLine();
        int nYear = Integer.parseInt(year);
        reader.close();
        System.out.println(name + " получает " + nSalary + " через " + nYear + " лет.");
    }
}
