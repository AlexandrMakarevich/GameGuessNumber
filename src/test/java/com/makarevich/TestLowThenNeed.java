package com.makarevich;

import org.junit.Assert;
import org.junit.Test;

public class TestLowThenNeed {

    private int needNumber = 55;

    private LowThenNeed lowThenNeed = new LowThenNeed(needNumber);

    @Test
    public void testCorrectNumber() {
        int actual = 43;
        Assert.assertEquals("Actual result must be expected ", true, lowThenNeed.compareData(actual));
    }

    @Test
    public void testNotCorrectlyNumber() {
        int actual = 77;
        Assert.assertEquals("Actual result must be expected ", false, lowThenNeed.compareData(actual));
    }
}
