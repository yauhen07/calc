package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BasicTest {
    @Parameters({"first, second, expected"})
    @Test(dataProvider = "valuesForPow")
    public void firstPowSecond(double first, double second, double expected) {
        double result = calc.pow(first, second);
        Assert.assertEquals(result, expected, "incorrect result pow");
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] dataForSum() {
        return new Object[][]{
                {2, 2, 4.0},
                {0, 10, 0.0},
                {-1, 3, -1.0},
                {2, -1, 0.5},
                {2, -2, 0.25},
                {2, 0, 1.0},
                {0, 0, 1.0}

        };
    }
}
