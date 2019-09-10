package com.maksym.laba1.fibonacci;

import org.apache.log4j.Logger;

import java.math.BigInteger;

public class BigNumFibonacci {
    private static final Logger log = Logger.getLogger(BigNumFibonacci.class);

    BigInteger fibonacci = new BigInteger("0");

     String fibonacci(int n) {
        try {

            if (n < 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            if (n == 1) return "1";
            BigInteger n1 = new BigInteger("0");
            BigInteger n2 = new BigInteger("1");
            BigInteger result = new BigInteger("0");

            for (int i = 2; i <= n; i++) {
                result = n1.add(n2);
                n1 = n2;
                n2 = result;
            }
            return result.toString();
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
        }
        return "0";
    }
}
