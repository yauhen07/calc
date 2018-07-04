package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTestNG {


    @Parameters({"first, expected"})
    //method has defect: ability to get square from negative values: input -4 expect: should throw Execption actual - pass
    @Test(dataProvider = "valuesForSqrt")
    public void firstSqrt(double first, double expected) {
        double result = calc.sqrt(first);
        Assert.assertEquals(result, expected, "incorrect result Sqrt");
    }

    @DataProvider(name = "valuesForSqrt")
    public Object[][] dataForSum() {
        return new Object[][]{
                {4.4, 2.0976176963403030939829070273599},
                {0.0, 0.0},
                {-4.0, 2.0},
                {1.0, 1.0},
                {3.0, 1.7320508075688772935274463415059},

        };
    }
}
