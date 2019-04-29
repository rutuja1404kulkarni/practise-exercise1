package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    Vowels vowels;
    @Before
    public void setUp() throws Exception {
        vowels=new Vowels();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkVowels() {
        String s1=vowels.checkVowels("a");
        assertEquals("Vowel",s1);
    }

    @Test
    public void checkConsonant()
    {
        String s2=vowels.checkConsonant("r");
        assertEquals("consonant",s2);
    }

    @Test
    public void checkValidInput()
    {
        String s3=vowels.checkValidInput(3);
        assertEquals("Invalid Input",s3);
    }

}