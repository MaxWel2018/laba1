package com.maksym.laba1.fibonacci;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BigNumFibonacciTest {
    private   BigNumFibonacci  fibonacci = new BigNumFibonacci();
    private static HashMap<Integer, String> fibonacciNum = new HashMap<>();

    @BeforeClass
    public static void init() {
        fibonacciNum.put(0,"0");
        fibonacciNum.put(1,"1");
        fibonacciNum.put(2,"1");
        fibonacciNum.put(3,"2");
        fibonacciNum.put(4, "3");
        fibonacciNum.put(10,"55");
        fibonacciNum.put(20,"6765");
        fibonacciNum.put(30,"832040");
        fibonacciNum.put(50,"12586269025");
    }
    @Test
    public void fibonacci() {
        for (Map.Entry<Integer, String> entry : fibonacciNum.entrySet()) {
            assertEquals(entry.getValue(),fibonacci.fibonacci(entry.getKey()));
        }
    }
}