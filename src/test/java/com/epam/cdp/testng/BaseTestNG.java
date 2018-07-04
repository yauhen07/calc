package com.epam.cdp.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestNG {

    protected Calculator calc;

    @BeforeClass
    public void setup() {
        System.out.println("Create instance of Calculator");
        calc = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calc = null;
    }


}
