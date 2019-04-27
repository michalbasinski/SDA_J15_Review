package pl.sda.fibonacci;

import java.math.BigDecimal;

public class FibonacciIterationalByKornelia implements Fibonacci {
    @Override
    public BigDecimal getN(int n) {
        BigDecimal firstFiboNo = new BigDecimal(0);
        BigDecimal secondFiboNo = new BigDecimal(1);

        if (n == 0) {
            secondFiboNo = firstFiboNo;
        }

        for (int i = 1; i < n; i++)
        {
            BigDecimal sum = firstFiboNo.add(secondFiboNo);
            firstFiboNo = secondFiboNo;
            secondFiboNo = sum;
        }
        return secondFiboNo;
    }
}
