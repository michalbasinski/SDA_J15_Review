package pl.sda.fibonacci;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FibonacciIterationalByKorneliaTest {

    private Fibonacci fibonacci = new FibonacciIterationalByKornelia();

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

    @Test
    public void shouldReturn0ForNEq0() {
        //given
        final int n = 0;
        final BigDecimal expectedResult = new BigDecimal(0);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1ForNEq1() {
        //given
        final int n = 1;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = fibonacci.getN(n);

        //then
        assertEquals(expectedResult, result);
    }
}