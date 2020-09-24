package com.testing.test;

import static org.junit.Assert.*;

import com.testing.src.Calculator;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testFactorial(){
        assertEquals(120, Calculator.factorial(5));
    }
    //Equivalence class testing
    @Test(expected = RuntimeException.class)
    public void testNegativeFactorial(){
        Calculator.factorial(-1);
    }
    //Boundary Value testing
    @Test
    public void testZeroFactorial(){
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    public void testCombination(){
        assertEquals(10, Calculator.combination(5,2));
    }

    @Test(expected = RuntimeException.class)
    public void testCombinationNegativeN(){
        Calculator.combination(-1,3);
    }

    @Test(expected = RuntimeException.class)
    public void testCombinationNegativeR(){
        Calculator.combination(3,-1);
    }

    @Test(expected = RuntimeException.class)
    public void testCombinationNegativeRAndNegativeN(){
        Calculator.combination(-1,-5);
    }

    @Test(expected = RuntimeException.class)
    public void testCombinationRGreaterThanN(){
        Calculator.combination(3,5);
    }

}
