package pl.sda.fibonacci;

public class FibonacciFactory {

    public Fibonacci produce(AlgorithmType type) {
        if (AlgorithmType.RECURSIVE.equals(type)) {
            return new FibonacciRecursive();
        }
        if (AlgorithmType.ITERATIONAL.equals(type)) {
            return new FibonacciIterational();
        }
        if (AlgorithmType.ITERATIONAL_BY_KORNELIA.equals(type)) {
            return new FibonacciIterationalByKornelia();
        }
        throw new UnsupportedAlgorithmTypeException();
    }

}
