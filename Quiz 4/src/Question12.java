/** Create a function public static java.util.stream.Stream<FibNumber> fib()
 * that creates an infinite stream of the Fibonacci numbers. Define also the following helper class:
 * */

public class Question12 {
    public static java.util.stream.Stream<FibNumber> fib() {
        return java.util.stream.Stream.iterate(
                new FibNumber(java.math.BigInteger.ZERO, java.math.BigInteger.ONE),
                fibNumber -> new FibNumber(fibNumber.getCurrent(), fibNumber.getPrevious().add(fibNumber.getCurrent()))
        );
    }

    static class FibNumber {
        private java.math.BigInteger previous;
        private java.math.BigInteger current;

        public FibNumber(java.math.BigInteger previous, java.math.BigInteger current) {
            this.previous = previous;
            this.current = current;
        }

        public java.math.BigInteger getPrevious() {
            return previous;
        }

        public java.math.BigInteger getCurrent() {
            return current;
        }

        public static int getNthFibonacciNumber(int n) {
            java.util.stream.Stream<FibNumber> stream = fib();
            java.util.Iterator<FibNumber> iterator = stream.iterator();
            for (int i = 0; i < n - 1; i++) {
                iterator.next();
            }
            return iterator.next().getCurrent().intValue();
        }
    }

    public static void main(String[] args) {
        java.util.stream.Stream<FibNumber> stream = fib();
        java.util.Iterator<FibNumber> iterator = stream.iterator();
        for (int i = 0; i < 9999; i++) {
            iterator.next();
        }
        System.out.println(iterator.next().getCurrent().intValue());
    }
}
