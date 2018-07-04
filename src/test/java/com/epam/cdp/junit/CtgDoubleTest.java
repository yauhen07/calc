package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class CtgDoubleTest extends BaseTestJunit {
    private double first;
    private double expected;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {45.0, 1.0},
                {60.0, 0.57},
                {90.0, 0.0},

        });
    }

    public CtgDoubleTest(double first, double expected) {
        this.first = first;
        this.expected = expected;
    }

    @Test
    public void FirstCtgDouble() {
        double result = calc.ctg(first);
        assertEquals(expected, result, 0.00005);

    }
}
