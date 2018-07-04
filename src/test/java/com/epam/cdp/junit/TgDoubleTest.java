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

    public TgDoubleTest(double first, double expected) {
        this.first = first;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {45.0, 1.0},
                {60.0, 1.732},
                {30.0, 0.577},

        });
    }
    //Tests failed as method used method cos(double a) which is return incorrect values
    @Test
    public void firstTgDouble() {
        double result = calc.tg(Math.toRadians(first));
        assertEquals("incorrect result Tg", expected, result, 0.00005);

    }
}
