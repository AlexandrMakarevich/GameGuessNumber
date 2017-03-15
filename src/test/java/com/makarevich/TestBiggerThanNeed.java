package com.makarevich;

import org.junit.Assert;
import org.junit.Test;

public class TestBiggerThanNeed {

    private int needNumber = 76;

    private BiggerThanNeed biggerThanNeed = new BiggerThanNeed(needNumber);

    @Test
    public void testCorrectNumber() {
        int actual = 88;
        Assert.assertEquals("Actual result must be expected ", true, biggerThanNeed.compareData(actual));
    }

    @Test
    public void testNotCorrectlyNumber() {
        int actual = 65;
        Assert.assertEquals("Actual result must be expected ", false, biggerThanNeed.compareData(actual));
    }
}
