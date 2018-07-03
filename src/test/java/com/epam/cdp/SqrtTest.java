package com.epam.cdp;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends BasicTest {


    @Parameters({"first, expected"})
    @Test(dataProvider = "valuesForSqrt")
    public void firstSqrt(double first, double expected) {
        double result = calc.sqrt(first);
        Assert.assertEquals(result, expected, "incorrect result Sqrt");
    }

    @DataProvider(name = "valuesForSqrt")
    public Object[][] dataForSum() {
        return new Object[][]{
                {4, 2.0},
                {0, 0.0},
                {-4, 2.0},
                {1, 1.0}

        };
    }
}
