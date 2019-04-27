package pl.sda.factorial;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        int n = 67;
        FactorialAlgorithmType factorialAlgorithmType = FactorialAlgorithmType.RECURSIVE;

        FactorialFactory factory = new FactorialFactory();
        Factorial factorial = factory.produce(factorialAlgorithmType);

        BigDecimal result = factorial.compute(n);

        System.out.println("Wartość silni:" + result);
    }
}
