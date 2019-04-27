package pl.sda.fibonacci;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciIterationalTest {

    private Fibonacci fibonacci = new FibonacciIterational();

    @Test
    public void shouldReturn5ForNEq5() {
        //given
        final int n = 5;
        final BigDecimal expectedResult = new BigDecimal(5);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedResult, result);
    }
}