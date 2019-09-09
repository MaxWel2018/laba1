package factorial;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigNumFactorialTest {
    BigNumFactorial bigNumFactorial = new BigNumFactorial();
    long[] expected = new long[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};

    @Test
    public void factorial() {
            for (int i = 0; i < expected.length; i++) {
                assertEquals(Long.toString(expected[i]), bigNumFactorial.factorial(i));
            }

    }
}