package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner1 = new Scanner(System.in);
        int years = scanner1.nextInt();
        scanner1.close();

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}