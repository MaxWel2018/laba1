package com.maksym.laba1.fibonacci;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LoopFibonacciTest {
    private  Fibonacci fibonacci = new LoopFibonacci();
    private static HashMap<Integer, Long> fibonacciNum = new HashMap<>();

    @BeforeClass
    public  static void initial() {

        fibonacciNum.put(0,0L);
        fibonacciNum.put(1,1L);
        fibonacciNum.put(2,1L);
        fibonacciNum.put(3,2L);
        fibonacciNum.put(4,3L);
        fibonacciNum.put(10,55L);
        fibonacciNum.put(20,6765L);
        fibonacciNum.put(30,832040L);
        fibonacciNum.put(50,12586269025L);

    }

    @Test
    public void fibonacci() {
        for (Map.Entry<Integer, Long> entry : fibonacciNum.entrySet()) {
            assertEquals(java.util.Optional.ofNullable(entry.getValue()),java.util.Optional.ofNullable(fibonacci.fibonacci(entry.getKey())));
        }

    }
}