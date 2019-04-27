package pl.sda.factorial;

import java.math.BigDecimal;

public class FactorialRecursive implements Factorial {

    @Override
    public BigDecimal compute(int n) {

        if (n == 0 || n == 1) {
            return new BigDecimal(1);
        } else {
            return compute(n - 1)
                    .multiply(new BigDecimal(n));
        }

    }
}
