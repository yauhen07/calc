package com.epam.cdp.junit;

import org.junit.Test;

public class ExeptionsTest extends BaseTestJunit {

    @Test(expected = Exception.class)
    public void divZero() {
        calc.div(1.5, 0);
    }
}
