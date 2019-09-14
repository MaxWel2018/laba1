package com.maksym.laba1.factorial;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

public class BigNumFactorialTest {
    private static BigNumFactorial bigNumFactorial = new BigNumFactorial();


    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void shouldReturnException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("n must be positive"));
        bigNumFactorial.factorial(-10);
    }

    @Test
    public void shouldReturnFactorialZero() {
        String actual = bigNumFactorial.factorial(0);
        assertEquals("1", actual);
    }

    @Test
    public void shouldReturnFactorialOne() {
        String actual = bigNumFactorial.factorial(1);
        assertEquals("1", actual);
    }

    @Test
    public void shouldReturnFactorialTwo() {
        String actual = bigNumFactorial.factorial(2);
        assertEquals("2", actual);
    }

    @Test
    public void shouldReturnFactorialFor() {
        String actual = bigNumFactorial.factorial(4);
        assertEquals("24", actual);
    }

    @Test
    public void shouldReturnFactorialSix() {
        String actual = bigNumFactorial.factorial(6);
        assertEquals("720", actual);
    }

    @Test
    public void shouldReturnFactorialEight() {
        String actual = bigNumFactorial.factorial(8);
        assertEquals("40320", actual);
    }

    @Test
    public void shouldReturnFactorialTen() {
        String actual = bigNumFactorial.factorial(10);
        assertEquals("3628800", actual);
    }


}