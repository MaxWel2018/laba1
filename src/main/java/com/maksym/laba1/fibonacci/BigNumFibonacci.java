package com.maksym.laba1.fibonacci;

import org.apache.log4j.Logger;

import java.math.BigInteger;

 class BigNumFibonacci {
    private static final Logger LOGGER = Logger.getLogger(BigNumFibonacci.class);

    BigInteger fibonacci = new BigInteger("0");

     String fibonacci(int n) {
        try {

            if (n < 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            if (n == 1) return "1";
            BigInteger num1 = new BigInteger("0");
            BigInteger num2 = new BigInteger("1");
            BigInteger result = new BigInteger("0");

            for (int i = 2; i <= n; i++) {
                result = num1.add(num2);
                num1 = num2;
                num2 = result;
            }
            return result.toString();
        } catch (IllegalArgumentException e) {
            LOGGER.error(e.getMessage());
            throw e;
        }
    }
}
