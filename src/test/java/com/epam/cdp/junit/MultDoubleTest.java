package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class MultDoubleTest extends BaseTestJunit {
    private double first;
    private double second;
    private double expected;

    public MultDoubleTest(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.1, 2.0, 0.2},
                {1.0, 0.2, 0.2},
                {0.5, 0.2, 0.1},
                {-0.5, 0.2, -0.1},
                {-0.5, -0.2, 0.1},
                {-0.0, 0.0, 0.0},
                {0.1, 0.2, 0.2}

        });
    }
    //method has defect: rounding is applied to result of multiplying, no rounding should applied
    @Test
    public void firstMultSecondDouble() {
        double result = calc.mult(first, second);
        assertEquals("incorrect result Mult", expected, result, 0.00005);
    }


}
