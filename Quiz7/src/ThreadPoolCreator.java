/**
 * Write a method
 * public java.util.concurrent.ExecutorService createPool(int numThreads)
 * that creates a fixed thread pool with given number of threads.
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.math.BigDecimal;

public class ThreadPoolCreator {
    public static Future<BigDecimal> fact(int n, ExecutorService pool) {
        Callable<BigDecimal> factorialTask = () -> {
            BigDecimal result = BigDecimal.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigDecimal.valueOf(i));
            }
            return result;
        };
        return pool.submit(factorialTask);
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        try {
            Future<BigDecimal> result = fact(20, pool);
            System.out.println(result.get());
        } catch (Exception ex) {
        } finally {
            try {
                pool.awaitTermination(1, java.util.concurrent.TimeUnit.SECONDS);
            } catch (InterruptedException e) {
            }
            pool.shutdown();
        }
    }
}
