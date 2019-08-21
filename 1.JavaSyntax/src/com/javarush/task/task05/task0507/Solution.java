package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Среднее арифметическое
*/

public class Solution {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static void main(String[] args) throws Exception {
        int count = 0;
        double sum = 0;
        double solution = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            if (number != -1) {
                sum += (double) (number);
                count++;

            } else if (number == -1) {
                reader.close();
                break;
            }
        }

        solution = round(sum / count, 1);
        System.out.println(solution);
    }
}

