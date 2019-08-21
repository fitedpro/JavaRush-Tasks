package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/

public class Circle {
    //centerX, centerY, radius, width, color

    public int centerX = 0;
    public int centerY = 0;
    public int radius = 0;
    public int width = 0;
    public int color = 0;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
