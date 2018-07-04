package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class SinDoubleTest extends BaseTestJunit {
    private double first;
    private double expected;

    public SinDoubleTest(double first, double expected) {
        this.first = first;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {45.0, 0.707},
                {60.0, 0.866},
                {-90.0, -1.0},
                {-65.5, -0.91},
        });
    }

    @Test
    public void firstSinDouble() {
        double result = calc.sin(Math.toRadians(first));
        assertEquals("incorrect result Sin", expected, result, 0.005);

    }
}
