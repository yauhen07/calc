package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class TgDoubleTest extends BaseTestJunit {
    private double first;
    private double expected;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {45.0, 1.0},
                {60.0, 1.732},
                {30.0, 0.577},

        });
    }

    public TgDoubleTest(double first, double expected) {
        this.first = first;
        this.expected = expected;
    }

    @Test
    public void FirstTgDouble() {
        double result = calc.tg(first);
        assertEquals(expected, result, 0.00005);

    }
}
