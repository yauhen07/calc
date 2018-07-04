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

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.1, 2.0, 0.2},
                {1.0, 0.2, 0.2},
                {0.5, 0.2, 0.1},
                {-0.5, 0.2, -0.1},
                {-0.5, -0.2, 0.1},
                {-0.0, 0.0, 0.0},
                {0.1, 0.2, 0.2},

        });
    }

    public MultDoubleTest(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }


    @Test
    public void FirstMultSecondDouble() {
        double result = calc.mult(first, second);
        assertEquals(expected, result, 0.00005);
    }


}
