package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern pattern;
    @Before
    public void setUp() throws Exception {
        pattern=new Pattern();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkNum() {
        String s=pattern.checkNum(-1);
        assertEquals("Invalid Number",s);
    }

    @Test
    public void checkValid()
    {
        String s=pattern.CheckValid("rutu");
        assertEquals("Invalid Input",s);
    }
}