package pl.sda.factorial;

public class FactorialFactory {
    public Factorial produce(FactorialAlgorithmType type) {
        if (FactorialAlgorithmType.ITERATIONAL.equals(type)) {
            return new FactorialIterational();
        }
        if (FactorialAlgorithmType.RECURSIVE.equals(type)) {
            return new FactorialRecursive();
        }
        throw new UnsupportedFactorialAlgorithm();
    }
}
