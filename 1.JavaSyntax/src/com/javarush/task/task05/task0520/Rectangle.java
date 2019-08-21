package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    public int top = 0;
    public int left = 0;
    public int width = 0;
    public int  height = 0;

    public Rectangle(int top, int left,  int height, int width) {
        this.top = top;
        this.height = height;
        this.width = width;
        this.left = left;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.height = 0;
        this.width = 0;
        this.left = left;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.width = width;
        this.left = left;
        this.height = width;
    }


    public Rectangle(Rectangle rectangle) {
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.left = rectangle.left;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
