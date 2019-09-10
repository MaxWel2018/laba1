package com.maksym.laba1.fibonacci;


import org.apache.log4j.Logger;

public class LoopFibonacci implements Fibonacci {

    private static final Logger log = Logger.getLogger(LoopFibonacci.class);


    public long fibonacci(int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            if (n == 1) return 1;
            long n1 = 0;
            long n2 = 1;
            long result = 0;
            for (int i = 2; i <= n; i++) {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
            }
            return result;
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
            return 0;

        }
    }
}
