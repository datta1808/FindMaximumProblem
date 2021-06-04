package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenFirstNumberAsMaxNumber_ShouldReturn_FirstNumberAsMax() {

        Integer maximum = findMaximum.findIntegerMaximum(800, 70, 115);
        Assert.assertEquals((Integer) 800, maximum);
    }
}
