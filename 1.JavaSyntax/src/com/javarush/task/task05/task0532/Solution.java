package com.javarush.task.task05.task0532;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int maximum = 0;
            int count = 1;
            int current = 0;
            int max = 0;
            while (true) {
                maximum = Integer.parseInt(reader.readLine());
                if (maximum < 0) {
                    System.out.println("Введите положительное число");
                } else if(maximum > 0) {
                    break;
                }
            }

            for (int i = 0; i < maximum; i++) {
                if (count == 1) {
                    current = Integer.parseInt(reader.readLine());
                    max = Math.max(current, current);
                    count++;
                } else if (count > 1){
                    current = Integer.parseInt(reader.readLine());
                    max = Math.max(max, current);
                }
            }
            System.out.println(max);
            reader.close();
    }
}
