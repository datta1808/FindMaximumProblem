package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenFirstNumber_AsMaxNumber_ShouldReturn_FirstNumber_AsMaximum() {
        Integer maximum = findMaximum.findIntegerMaximum(800, 70, 115);
        Assert.assertEquals((Integer) 800, maximum);
    }

    @Test
    public void givenSecondNumber_AsMaXNumber_ShouldReturn_SecondNumber_AsMaximum() {
        Integer maximum1 = findMaximum.findIntegerMaximum(5, 250, 112);
        Assert.assertEquals((Integer) 250, maximum1);
    }

    @Test
    public void givenThirdNumber_AsMaXNumber_ShouldReturnThirdNumber_AsMaximum() {
        Integer maximum2 = findMaximum.findIntegerMaximum(109, 200, 999);
        Assert.assertEquals((Integer) 999, maximum2);
    }
}
