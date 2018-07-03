package com.epam.cdp;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTest extends BasicTest {

    @Parameters({"first, second, expected"})
    @Test(dataProvider = "valuesForSubTest")
    public void twoMinusOne(long first, long second, long expected) {
        long result = calc.sub(first, second);
        Assert.assertEquals(result, expected, "invalid result sub");

    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] dataForSum() {
        return new Object[][]{
                {1, 2, -1},
                {0, 0, 0},
                {-1, 1, -2},
                {1, -10, 11}

        };
    }

}
