package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test; 
public class MultiplicationTest { 
@Test 
    void testMultiplyPositive() { 
        Multiplication calc = new Multiplication(); 
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 ni 6-tai tentsuu baih yostoi"); 
} 
@Test 
    void testMultiplyNegative() { 
        Multiplication calc = new Multiplication(); 
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 ni 6-tai tentsuu baih ystoi "); 
    } 
} 
