package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tomJerry;
    @Before
    public void setUp() throws Exception {
        tomJerry=new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEven() {
        String s1=tomJerry.testEven(21);
        assertEquals("jerry",s1);
    }

    @Test
    public void testOdd()
    {
        String s=tomJerry.testOdd(22);
        assertEquals("tom",s);
    }
}