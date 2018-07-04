package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivTest extends BaseTestNG {

    @Test(expectedExceptions = Exception.class)
    public void divZero() {
        long result = calc.div(1, 0);

    }

    @Parameters({"first, second, expected"})
    @Test(dataProvider = "valuesForDiv")
    public void firstDivSecond(long first, long second, long expected) {
        long result = calc.div(first, second);
        Assert.assertEquals(result, expected, "incorrect result division");
    }

    @DataProvider(name = "valuesForDiv")
    public Object[][] dataForSum() {
        return new Object[][]{
                {4, 2, 2},
                {0, 10, 0},
                {-1, 1, -1},
                {2, -1, -2}
        };
    }

}
