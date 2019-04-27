package pl.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements Fibonacci {

    @Override
    public BigDecimal getN(int n) {
        BigDecimal prev = new BigDecimal(-1);
        BigDecimal current = new BigDecimal(1);

        for (int i = 0; i <= n; i++) {
            BigDecimal temp = prev;
            prev = current;
            current = current.add(temp);
        }

        return current;
    }

}
