package com.gappu.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size] = num;
        size++;
    }


    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void remove() {
        size--;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list.size());
        CustomArrayList myList = new CustomArrayList();
        myList.add(1);
        myList.remove();
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
