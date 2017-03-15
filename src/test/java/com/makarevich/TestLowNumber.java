package com.makarevich;

import org.junit.Assert;
import org.junit.Test;

public class TestLowNumber {

   private LowNumber lowNumber = new LowNumber();

    @Test
    public void testCorrectNumber() {
        int actual = -55;
        Assert.assertEquals("Actual result must be expected ", true, lowNumber.compareData(actual));
    }

    @Test
    public void testNotCorrectlyNumber() {
        int actual = 4;
        Assert.assertEquals("Actual result must be expected ", false, lowNumber.compareData(actual));
    }
}
