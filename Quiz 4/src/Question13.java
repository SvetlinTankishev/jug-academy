/** Write a function public java.util.function.Function<Integer, java.math.BigInteger> degree(int n)
 * that returns a lambda function to bring a number to a degree n
 * */

public class Question13 {
    public java.util.function.Function<Integer, java.math.BigInteger> degree(int n) {
        return x -> java.math.BigInteger.valueOf(x).pow(n);
    }
}
