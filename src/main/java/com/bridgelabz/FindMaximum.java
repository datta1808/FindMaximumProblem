package com.bridgelabz;

public class FindMaximum {

    public Integer findIntegerMaximum(Integer number1, Integer number2, Integer number3) {

        Integer maximum = number1;

        if(number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }

    public Float findFloatMaximum(Float number1, Float number2, Float number3) {

        Float maximum = number1;

        if (number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }

    public String findStringMaximum(String number1,String number2,String number3) {

        String maximum = number1;

        if (number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }
}
