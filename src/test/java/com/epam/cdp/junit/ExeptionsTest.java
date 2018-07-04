package com.epam.cdp.junit;

import org.junit.Test;

public class ExeptionsTest extends BaseTestJunit {
    //method has defect: no exception in method
    @Test(expected = NumberFormatException.class)
    public void divZero() {
        calc.div(1.5, 0);
    }
}
