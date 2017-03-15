package com.makarevich;

import org.junit.Assert;
import org.junit.Test;

public class TestBigestNumber {

    private BigestNumber bigestNumber = new BigestNumber();

    @Test
    public void testCorrectNumber() {
        int actual = 45;
        Assert.assertEquals("Actual result must be expected ", false, bigestNumber.compareData(actual));
    }

    @Test
    public void testNotCorrectlyNumber() {
        int actual = 333;
        Assert.assertEquals("Actual result must be expected ", true, bigestNumber.compareData(actual));
    }
}
