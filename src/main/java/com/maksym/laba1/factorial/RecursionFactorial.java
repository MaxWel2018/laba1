package com.maksym.laba1.factorial;

import org.apache.log4j.Logger;

public class RecursionFactorial implements Factorial {
    private static final Logger log = Logger.getLogger(RecursionFactorial.class);

    public long factorial(int n) {
        try {
            if (n >= 0) {

                if (n == 0 || n == 1) return 1;
                return n * factorial(n - 1);
            } else {
                throw new IllegalArgumentException("n must be positive");
            }
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
            return 0;
        }
    }
}
