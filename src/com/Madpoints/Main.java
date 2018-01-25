package com.Madpoints;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10.0; dbl += 0.5) {
            myDoubleList.add(dbl); // Double.valueOf(i)
        }
        for (int i = 0; i < myDoubleList.size(); i++) {
            System.out.println(myDoubleList.get(i));
        }
    }
}
