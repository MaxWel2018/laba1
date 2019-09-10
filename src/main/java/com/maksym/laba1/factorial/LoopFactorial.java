package com.maksym.laba1.factorial;

import org.apache.log4j.Logger;

public class LoopFactorial implements Factorial {
    private static final Logger log = Logger.getLogger(LoopFactorial.class);

    public long factorial(int n) {
        try {
            if (n >= 0) {

                if (n == 1 || n == 0) return 1;
                long result = 1;
                for (long i = 1; i <= n; i++) result *= i;
                return result;
            }else{
                throw new IllegalArgumentException("n must be positive");

            }
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
            return 0;
        }
    }
}
