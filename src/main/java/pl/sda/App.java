package pl.sda;

import pl.sda.fibonacci.FibonacciAlgorithmType;
import pl.sda.fibonacci.Fibonacci;
import pl.sda.fibonacci.FibonacciFactory;
import pl.sda.enumexample.Planets;

import java.math.BigDecimal;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String nString = scanner.next();
        String algorithmType = scanner.next();

        FibonacciAlgorithmType type = FibonacciAlgorithmType.valueOf(algorithmType);

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
