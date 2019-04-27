package pl.sda.fibonacci;

public class FibonacciFactory {

    public Fibonacci produce(FibonacciAlgorithmType type) {
        if (FibonacciAlgorithmType.RECURSIVE.equals(type)) {
            return new FibonacciRecursive();
        }
        if (FibonacciAlgorithmType.ITERATIONAL.equals(type)) {
            return new FibonacciIterational();
        }
        if (FibonacciAlgorithmType.ITERATIONAL_BY_KORNELIA.equals(type)) {
            return new FibonacciIterationalByKornelia();
        }
        throw new UnsupportedAlgorithmTypeException();
    }

}
