package com.javarush.task.task07.task0716;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        //strings = fix(strings);
        System.out.println(strings.get(0));
        System.out.println(strings.get(0).matches("(.*)р(.*)"));


    }
}
