package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrStrings = new ArrayList<String>();
        String s = "s";
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        arrStrings.add(s);
        arrStrings.add(s1);
        arrStrings.add(s2);
        arrStrings.add(s3);
        arrStrings.add(s4);

        System.out.println(arrStrings.size());

        for (int i = 0; i < arrStrings.size(); i++) {
            System.out.println(arrStrings.get(i));
        }


    }
}
