package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenFirstNumber_AsMaxNumber_ShouldReturn_FirstNumberAsMax() {
        Integer maximum = findMaximum.findIntegerMaximum(800, 70, 115);
        Assert.assertEquals((Integer) 800, maximum);
    }

    @Test
    public void givenSecondNumber_AsMaXNumber_ShouldReturnSecondNumber_AsMaximum() {
        Integer maximum1 = findMaximum.findIntegerMaximum(5, 250, 112);
        Assert.assertEquals((Integer) 250, maximum1);
    }

}
