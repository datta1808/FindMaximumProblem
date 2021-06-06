package com.bridgelabz;

public class FindMaximum <T extends Comparable<T>> {

    T[] values;

    @SafeVarargs
    public FindMaximum(T ...values) {
        this.values=values;
    }

    public T testMax() {
        T maximum = findMaximum(values);
        printMaximum(maximum);
        return maximum;
    }

    public static <T> void printMaximum(T maximum) {
        System.out.println("Maximum is: " + maximum);
    }

    @SafeVarargs
    public static <T extends Comparable<T>> T findMaximum(T... values) {

        T maximum  = values[0];   // assume x is initially the largest

        for(int i = 1; i < values.length; i++) {
            if (maximum.compareTo(values[i]) < 0) {
                maximum = values[i];
            }
        }
        return  maximum;
    }
}