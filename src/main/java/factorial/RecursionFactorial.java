package factorial;

public class RecursionFactorial implements Factorial {

    public long factorial(int n) {
        if(n==0||n==1) return 1;
        return n * factorial(n - 1);
    }
}
