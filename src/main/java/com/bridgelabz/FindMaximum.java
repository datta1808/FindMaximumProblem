package com.bridgelabz;

public class FindMaximum {
    public static void main(String[] args) {
        printMax(findIntegerMaximum(100, 200, 400));
    }
    public static Integer findIntegerMaximum(Integer number1, Integer number2, Integer number3) {
        Integer maximum = number1;
        if(number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }

    private static void printMax(Integer max) {
        System.out.println(" Maximum number is : " + max);
    }
}
