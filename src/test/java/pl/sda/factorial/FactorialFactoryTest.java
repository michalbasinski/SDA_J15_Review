package pl.sda.factorial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialFactoryTest {

    FactorialFactory factory = new FactorialFactory();

    @Test
    public void shouldProduceRecursive() {
        //given
        final FactorialAlgorithmType type = FactorialAlgorithmType.RECURSIVE;

        //when
        Factorial result = factory.produce(type);

        //then
        Assert.assertTrue(result instanceof Factorial);
        Assert.assertTrue(result instanceof FactorialRecursive);

        Assert.assertFalse(result instanceof FactorialIterational);
    }

    @Test
    public void shouldProduceIterational() {
        //given
        final FactorialAlgorithmType type = FactorialAlgorithmType.ITERATIONAL;

        //when
        Factorial result = factory.produce(type);

        //then
        Assert.assertTrue(result instanceof Factorial);
        Assert.assertTrue(result instanceof FactorialIterational);

        Assert.assertFalse(result instanceof FactorialRecursive);
    }
}