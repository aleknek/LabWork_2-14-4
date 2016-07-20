package com.brainacad.oop.testgenerics3;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arr1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        MyMixer myMixer = new MyMixer<>(arr);
        MyMixer myMixer1 = new MyMixer<>(arr1);
        myMixer.shuffle();
        myMixer1.shuffle();

        System.out.println(myMixer);
        System.out.println(myMixer1);
    }
}
