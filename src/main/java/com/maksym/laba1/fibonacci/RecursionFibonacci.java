package com.maksym.laba1.fibonacci;

import org.apache.log4j.Logger;

public class RecursionFibonacci implements  Fibonacci  {
    private static final Logger log = Logger.getLogger(RecursionFibonacci.class);

    @Override
    public long fibonacci(int n) {
        try {
            if (n >= 0) {
                if (n == 0) return 0;
                if (n == 1) return 1;
                return fibonacci(n - 1) + fibonacci(n - 2);
            } else throw new IllegalArgumentException("n must be positive");
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
            return 0;

        }
    }
}
