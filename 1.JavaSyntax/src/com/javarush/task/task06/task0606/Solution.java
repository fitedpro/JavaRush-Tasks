package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/



public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        reader.close();

        if (n == 0) {
            System.out.println("n == " + n);
        } else {
            int k;
            int f;
            n = Math.abs(n);
            for (k = 0; n > 0; ++k) {
                f = n % 10;
                n /= 10;
                if (f != 0) {
                    if ((f % 2) == 0) {
                        even++;
                    } else if ((f % 2) != 0) {
                        odd++;
                    }
                }
                else if (f == 0) {
                    if ((n % 2) == 0) {
                        even++;
                    } else if ((n % 2) != 0) {
                        odd++;
                    }
                }
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
