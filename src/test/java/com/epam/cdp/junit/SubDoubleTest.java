package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class SubDoubleTest extends BaseTestJunit {
    private double first;
    private double second;
    private double expected;

    public SubDoubleTest(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.1, 2, -1.9},
                {1, 0.2, 0.8},
                {0.5, 0.2, 0.3},
                {-0.5, 0.2, -0.7},
                {-0.5, -0.2, -0.3},
                {-0.0, 0.0, 0.0},
                {0.1, 0.2, -0.1},

        });
    }

    @Test
    public void firstMinusSecondDouble() {
        double result = calc.sub(first, second);
        assertEquals("incorrect result Sub", expected, result, 0.00005);
    }


}