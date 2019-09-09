package factorial;

import java.math.BigInteger;

public class BigNumFactorial  {

    public String factorial(int n) {

        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }


}
