package com.maksym.laba1.factorial;

import com.maksym.laba1.fibonacci.BigNumFibonacci;
import org.apache.log4j.Logger;

import java.math.BigInteger;

class BigNumFactorial {
    private static final Logger log = Logger.getLogger(BigNumFactorial.class);


    String factorial(int n) {

        try {
            if (n >= 0) {

                BigInteger factorial = new BigInteger("1");
                for (int i = 1; i <= n; i++) {
                    factorial = factorial.multiply(new BigInteger(i + ""));
                }
                return factorial.toString();
            } else {
                throw new IllegalArgumentException("n must be positive");


            }
        } catch (IllegalArgumentException e) {

            log.error(e.getMessage());
            return "0";
        }
    }


}
