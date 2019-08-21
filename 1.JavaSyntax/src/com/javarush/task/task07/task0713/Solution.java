package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listTriple = new ArrayList<>();
        ArrayList<Integer> listDouble = new ArrayList<>();
        ArrayList<Integer> listAll = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int  i = 0;  i < 20;  i++) {
            int v = scanner.nextInt();
            listMain.add(v);
        }
        scanner.close();

        for (int i = 0; i < listMain.size(); i++) {
            int v = listMain.get(i);
            if (v % 3 == 0)
                if (v % 2 == 0) {
                    listTriple.add(v);
                    listDouble.add(v);
                } else {
                    listTriple.add(v);
                }
            else if (v % 2 == 0)
                listDouble.add(v);
            else
                listAll.add(v);
        }

        printList(listTriple);
        printList(listDouble);
        printList(listAll);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
