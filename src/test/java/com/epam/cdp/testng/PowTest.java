package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowTest extends BaseTestNG {
    @Parameters({"first, second, expected"})
    //method has defect: rounding is applied to exponent, no rounding should applied
    @Test(dataProvider = "valuesForPow")
    public void firstPowSecond(double first, double second, double expected) {
        double result = calc.pow(first, second);
        Assert.assertEquals(result, expected, "incorrect result pow");
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] dataForSum() {
        return new Object[][]{
                {2.5, 2.0, 6.25},
                {0.5, 5.0, 0.03125},
                {-1.5, 3, -3.375},
                {2.0, -1.0, 0.5},
                {2.0, -2.0, 0.25},
                {2.0, -2.3, 0.20306309908905888065242734569382},
                {2.5, 1.5, 3.9528470752104741649986169305409},
                {0.0, 0.0, 1.0}

        };
    }
}
