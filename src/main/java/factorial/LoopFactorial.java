package factorial;

public class LoopFactorial implements Factorial {
    public long factorial(int n) {
        if (n == 1 || n == 0) return 1;
        long result = 1;
        for (long i = 1; i <= n; i++) result *= i;
        return result;
    }
}
