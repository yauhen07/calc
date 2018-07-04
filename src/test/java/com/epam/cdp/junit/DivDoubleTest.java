package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(value = Parameterized.class)
public class DivDoubleTest extends BaseTestJunit {
    private double first;
    private double second;
    private double expected;

    public DivDoubleTest(double first, double second, double expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.1, 2.0, 0.05},
                {1.0, 0.2, 5.0},
                {0.5, 0.2, 2.5},
                {-0.5, 0.2, -2.5},
                {-0.5, -0.2, 2.5},
                {0.1, 0.2, 0.5}
        });
    }

    @Test
    public void firstDivSecondDouble() {
        double result = calc.div(first, second);
        assertEquals("incorrect result Div", expected, result, 0.00005);

    }
}