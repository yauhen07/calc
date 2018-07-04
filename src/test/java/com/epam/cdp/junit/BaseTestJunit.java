package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class BaseTestJunit {


    protected Calculator calc;

    @Before
    public void setup() {
        System.out.println("Create instance of Calculator");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }


}

