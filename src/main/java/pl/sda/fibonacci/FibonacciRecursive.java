package pl.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursive implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {
        if (n == 0) {
            return new BigDecimal(0);
        } else if (n == 1) {
            return new BigDecimal(1);
        } else {
            BigDecimal n1 = getN(n - 1);
            BigDecimal n2 = getN(n - 2);
            return n1.add(n2);
        }
    }

}
