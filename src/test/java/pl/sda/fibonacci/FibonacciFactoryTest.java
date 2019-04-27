package pl.sda.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciFactoryTest {

    FibonacciFactory factory = new FibonacciFactory();

    @Test
    public void shouldProduceRecursiveFibonacci() {
        //given
        final FibonacciAlgorithmType type = FibonacciAlgorithmType.RECURSIVE;

        //when
        Fibonacci result = factory.produce(type);

        //then
        Assert.assertTrue(result instanceof Fibonacci);
        Assert.assertTrue(result instanceof FibonacciRecursive);

        Assert.assertFalse(result instanceof FibonacciIterational);
        Assert.assertFalse(result instanceof FibonacciIterationalByKornelia);
    }
}