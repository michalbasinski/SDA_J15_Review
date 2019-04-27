package pl.sda.factorial;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FactorialIterationalTest {

    Factorial factorial = new FactorialIterational();

    @Test
    public void shouldReturn120ForNEq5() {
        //given
        final int n = 5;
        final BigDecimal expectedResult = new BigDecimal(120);

        //when
        BigDecimal result = factorial.compute(n);

        //then
        Assert.assertEquals(expectedResult, result);
    }
}