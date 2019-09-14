package com.maksym.laba1.fibonacci;

import org.assertj.core.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RecursionFibonacciTest {
    private Fibonacci fibonacci = new RecursionFibonacci();

    private int i;
    private long expResult;

    public RecursionFibonacciTest(int i, long expResult) {
        this.i = i;
        this.expResult = expResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        Object[][] data = new Object[][]{
                {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3},
                {10, 55}, {20, 6765}, {30, 832040}

        };
        return Arrays.asList(data);
    }

    @Test
    public void shouldReturnNumberFibonacci() {
        long result = fibonacci.fibonacci(i);
        assertEquals(expResult, result);

    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldReturnException() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage(containsString("n must be positive"));
        fibonacci.fibonacci(-10);
    }
}