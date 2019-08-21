package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String s = bis.readLine();
        bis.close();
        return s;
    }

    public static int readInt() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(bis.readLine());
        bis.close();
        return s;
    }

    public static double readDouble() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        Double s = Double.parseDouble(bis.readLine());
        bis.close();
        return s;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        String s = bis.readLine();
        if (s.equals("true")) {
            return true;
        }
        if (s.equals("false")) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {

    }
}
