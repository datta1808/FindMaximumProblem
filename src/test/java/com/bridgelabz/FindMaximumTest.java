package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    // Test case to find the maximum of three Integers
    @Test
    public void  givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(10, 5, 2, 6);
        Integer result = findMaximum.testMax();
        Assert.assertSame(10, result);
    }

    @Test
    public void  givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(5, 10, 2);
        Integer result = findMaximum.testMax();
        Assert.assertSame(10, result);
    }

    @Test
    public void  givenInteger_whenThirdIntegerIsMax_ReturnSame() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(2, 5, 10);
        Integer result = findMaximum.testMax();
        Assert.assertSame(10, result);
    }


    // Test cases to find the maximum of 3 Floats
    @Test
    public void  givenFloat_whenFirstFloatIsMax_ReturnSame() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(10.5f, 5.5f, 2.5f);
        Float result = findMaximum.testMax();
        Assert.assertEquals((Float) 10.5f, result);
    }

    @Test
    public void  givenFloat_whenSecondFloatIsMax_ReturnSame() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(5.5f, 10.5f, 2.5f);
        Float result = findMaximum.testMax();
        Assert.assertEquals((Float) 10.5f, result);
    }

    @Test
    public void  givenFloat_whenThirdFloatIsMax_ReturnSame() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(2.5f, 5.5f, 10.5f);
        Float result = findMaximum.testMax();
        Assert.assertEquals((Float) 10.5f, result);
    }


    // Test cases to find the maximum of 3 Strings
    @Test
    public void  givenString_whenFirstStringIsMax_ReturnSame() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Banana", "Apple", "Plum");
        String result = findMaximum.testMax();
        Assert.assertSame("Plum", result);
    }

    @Test
    public void  givenString_whenSecondStringIsMax_ReturnSame() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Apple", "Banana", "Plum");
        String result = findMaximum.testMax();
        Assert.assertSame("Plum", result);
    }

    @Test
    public void  givenString_whenThirdStringIsMax_ReturnSame() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Apple", "Plum", "Banana");
        String result = findMaximum.testMax();
        Assert.assertSame("Plum", result);
    }


    // Test case for MOre than 3 parameters
    @Test
    public void givenMultipleInt_shouldReturn_maxInt() {
        Assert.assertSame(4, new FindMaximum<>(1, 2, 3, 4).testMax());
    }

    @Test
    public void givenMultipleFloat_shouldReturn_maxFloat() {
        Assert.assertEquals((Float) 4.4f, new FindMaximum<>(1.1f, 2.2f, 3.3f, 4.4f).testMax());
    }

    @Test
    public void givenMultipleString_shouldReturn_maxString() {
        Assert.assertEquals("peach", new FindMaximum<>("peach", "banana", "apple", "coconut").testMax());
    }
}
