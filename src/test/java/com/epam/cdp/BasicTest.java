package com.epam.cdp;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicTest {

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
