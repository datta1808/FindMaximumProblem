package com.bridgelabz;

public class FindMaximum {

    public  static <T extends Comparable<T>> T testMax(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }
}
