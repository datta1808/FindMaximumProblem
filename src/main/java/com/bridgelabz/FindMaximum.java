package com.bridgelabz;
public  class FindMaximum <T extends Comparable<T>> {

    T x, y, z;
    T max;

    public FindMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T testMax() {
        max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}