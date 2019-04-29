package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {
    OddEven oddEven;
    @Before
    public void setUp() throws Exception {
        oddEven=new OddEven();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findEven() {

        boolean b1= oddEven.findEven(12);
        assertEquals(true, b1);


    }
    @Test
    public void findOdd(){
        boolean b2=oddEven.findOdd(13);
        assertEquals(false,b2);
    }

    @Test
    public void checkInvalidInput()
    {
        String s1=oddEven.checkInvalidInput(2);
        assertEquals("Invalid Output",s1);
    }


}