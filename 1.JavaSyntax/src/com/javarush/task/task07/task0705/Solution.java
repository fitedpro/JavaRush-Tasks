package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] arrInt = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int[] arrInt2 = new int[10];
        int[] arrInt3 = new int[10];

        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (i < 9) {
                arrInt2[i] = arrInt[i];
            } else if(i > 9){
                arrInt3[count] = arrInt[i];
                count++;
            }
        }

        for (int i = 0; i < arrInt3.length; i++) {
            System.out.println(arrInt3[i]);
        }

    }
}
