package pl.sda;

import pl.sda.fibonacci.AlgorithmType;
import pl.sda.fibonacci.Fibonacci;
import pl.sda.fibonacci.FibonacciFactory;
import pl.sda.enumexample.Planets;

import java.math.BigDecimal;

public class App
{
    public static void main( String[] args )
    {
        String nString = args[0];
        String algorithmType = args[1];

        AlgorithmType type = AlgorithmType.valueOf(algorithmType);

        FibonacciFactory factory = new FibonacciFactory();
        Fibonacci fibonacci = factory.produce(type);

        Integer n = Integer.parseInt(nString);
        BigDecimal result = fibonacci.getN(n);

        System.out.println("Obliczony wyraz ciągu Fibonacciego: " + result);
    }

    private void enumEx() {
        Planets earth = Planets.EARTH;
    }
}
