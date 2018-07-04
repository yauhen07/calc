package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class CosDoubleTest extends BaseTestJunit {
    private double first;
    private double expected;

    public CosDoubleTest(double first, double expected) {
        this.first = first;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 1.0},
                {30.0, 0.866},
                {-60.0, 0.5,},
                {90.0, 0.0}
        });
    }
    //method has defect: Math.sin() method used to calculate Cos value
    @Test
    public void firstCosDouble() {
        double result = calc.cos(Math.toRadians(first));
        assertEquals("incorrect result Cos", expected, result, 0.005);

    }
}
