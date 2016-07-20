package com.brainacad.oop.testgenerics3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {

    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle() {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[random.nextInt(arr.length)];
        }
        return arr;
    }

    @Override
    public String toString() {
        return "MyMixer{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

