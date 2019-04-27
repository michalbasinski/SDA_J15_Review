package pl.sda.factorial;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        int n = 100000;

        FactorialAlgorithmType factorialAlgorithmType = FactorialAlgorithmType.ITERATIONAL;
        FactorialFactory factory = new FactorialFactory();
        Factorial factorial = factory.produce(factorialAlgorithmType);

        BigDecimal result = factorial.compute(n);

        System.out.println("Wartość silni:" + result);
    }
}
