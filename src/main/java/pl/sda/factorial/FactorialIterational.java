package pl.sda.factorial;

import java.math.BigDecimal;

public class FactorialIterational implements Factorial {

    @Override
    public BigDecimal compute(int n) {
        BigDecimal result = new BigDecimal(1);

        for (int i = 1 ; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }

        return result;
    }

}
