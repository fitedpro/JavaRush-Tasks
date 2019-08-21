package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;//напишите тут ваш код
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b != 0) {
            double solution = Double.valueOf(b);
            return solution = a / solution;
        }
        return 0;
    }

    public static double percent(int a, int b) {
        return (double)(b * a) / 100;
    }

    public static void main(String[] args) {

    }
}