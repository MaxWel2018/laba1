package com.maksym.laba1.fibonacci;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RecursionFibonacciTest {
    private   Fibonacci  fibonacci = new RecursionFibonacci();
    private static HashMap<Integer, Long> fibonacciNum = new HashMap<>();

    @BeforeClass
    public static void init() {
        fibonacciNum.put(0,0L);
        fibonacciNum.put(1,1L);
        fibonacciNum.put(2,1L);
        fibonacciNum.put(3,2L);
        fibonacciNum.put(4,3L);
        fibonacciNum.put(10,55L);
    }
    @Test
    public void fibonacci() {
        for (Map.Entry<Integer, Long> entry : fibonacciNum.entrySet()) {
            assertEquals(java.util.Optional.ofNullable(entry.getValue()),java.util.Optional.ofNullable(fibonacci.fibonacci(entry.getKey())));
        }
    }
}