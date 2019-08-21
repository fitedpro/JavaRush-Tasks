package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        String fifteen = "15:00";
        String fifteenHour = "15:30";
        String fif[] = fifteenHour.split(":");
        int sol = Integer.parseInt(fif[1]);
        secondsAfter15 = sol * 60;
        System.out.println(secondsAfter15);
    }
}