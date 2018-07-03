package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTest extends BasicTest {

    @Test(groups = "Traning")
    public void onePlusTwo(){
        long result = calc.sum(1,2);
        Assert.assertEquals(result,3, "invalid result sum");
    }


    @Parameters({"first, second, expected"})
    @Test(dataProvider = "valuesForSumTest")
    public void FirstPlusSecond(long first, long second, long expected) {
        long result = calc.sum(first, second);
        Assert.assertEquals(result, expected, "invalid result sum");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] dataForSum (){
        return new Object[][]{
                {1,2,3},
                {0,0,0},
                {-1,1,0},
                {1,-10,-9}
        };
    }



}
