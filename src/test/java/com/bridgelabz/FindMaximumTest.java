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

    @Test
    public void givenFirstFloat_AsMaxNumber_ShouldReturn_FirstFloat_AsMaximum() {
        Float max1 = findMaximum.findFloatMaximum(50f, 20f, 10f);
        Assert.assertEquals((Float) 50f, max1);
    }

    @Test
    public void givenSecondFloat_AsMaxNumber_ShouldReturn_SecondFloat_AsMaximum() {
        Float max2 = findMaximum.findFloatMaximum(10f, 30f, 20f);
        Assert.assertEquals((Float) 30f, max2);
    }

    @Test
    public void givenThirdFloat_AsMaxNumber_ShouldReturn_ThirdFloat_AsMaximum() {
        Float max3 = findMaximum.findFloatMaximum(7f, 23f, 40f);
        Assert.assertEquals((Float) 40f, max3);
    }

    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum() {
        String max2 = findMaximum.findStringMaximum("peach", "apple", "banana");
        Assert.assertEquals("peach", max2);
    }

    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum() {
        String max2 = findMaximum.findStringMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", max2);
    }

    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum() {
        String max2 = findMaximum.findStringMaximum("apple", "banana", "peach");
        Assert.assertEquals("peach", max2);
    }
}
