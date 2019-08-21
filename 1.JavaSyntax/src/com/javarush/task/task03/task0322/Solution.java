package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        //Вася + Ева + Анжелика = Чистая любовь, да-да!
        System.out.println(name + " + " + name1 + " + " + name2 + "  =  Чистая любовь, да-да!");
    }
}