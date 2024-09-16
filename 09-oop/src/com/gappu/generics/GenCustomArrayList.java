package com.gappu.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenCustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenCustomArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T val) {
        if (isFull()) {
            resize();
        }
        data[size] = val;
        size++;
    }


    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void remove() {
        size--;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "GenCustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(list.size());
        GenCustomArrayList<Integer> myList = new GenCustomArrayList<>();
        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
//        myList.remove();
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
