package com.maksym.laba1.factorial;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class LoopFactorialTest {
    private Factorial loopFactorial = new LoopFactorial();
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldReturnException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("n must be positive"));
        loopFactorial.factorial(-10);
    }

    @Test
    public void shouldReturnFactorialZero() {
        long actual = loopFactorial.factorial(0);
        assertEquals(1, actual);
    }

    @Test
    public void shouldReturnFactorialOne() {
        long actual = loopFactorial.factorial(1);
        assertEquals(1, actual);
    }

    @Test
    public void shouldReturnFactorialTwo() {
        long actual = loopFactorial.factorial(2);
        assertEquals(2, actual);
    }

    @Test
    public void shouldReturnFactorialFor() {
        long actual = loopFactorial.factorial(4);
        assertEquals(24, actual);
    }

    @Test
    public void shouldReturnFactorialSix() {
        long actual = loopFactorial.factorial(6);
        assertEquals(720, actual);
    }

    @Test
    public void shouldReturnFactorialEight() {
        long actual = loopFactorial.factorial(8);
        assertEquals(40320, actual);
    }

    @Test
    public void shouldReturnFactorialTen() {
        long actual = loopFactorial.factorial(10);
        assertEquals(3628800, actual);
    }


}