package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultTest extends BasicTest {

    @Test(groups = "Traning")
    public void zeroMultOne() {
        long result = calc.mult(0, 1);
        Assert.assertEquals(result, 0, "multiply by 0");
    }

    @Parameters({"first, second, expected"})
    @Test(dataProvider = "valuesForMult", description = "Multiply Long")
    public void firstMultSecond(long first, long second, long expected) {
        long result = calc.mult(first, second);
        Assert.assertEquals(result, expected, "incorrect result multiply");
    }

    @DataProvider(name = "valuesForMult")
    public Object[][] dataForSum() {
        return new Object[][]{
                {1, 2, 2},
                {0, 0, 0},
                {-1, 1, -1},
                {1, -10, -10}
        };
    }
}
