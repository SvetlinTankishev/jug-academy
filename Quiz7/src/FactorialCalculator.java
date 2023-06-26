/**
 * Write a method
 * public java.util.concurrent.ExecutorService createPool(int numThreads)
 * that creates a fixed thread pool with given number of threads.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FactorialCalculator {
    public static ExecutorService createPool(int numThreads) {
        return Executors.newFixedThreadPool(numThreads);
    }

    public static void main(String[] args) {
        ExecutorService pool = createPool(14);
        System.out.println(pool instanceof ThreadPoolExecutor);
        ThreadPoolExecutor fixedPool = (ThreadPoolExecutor) pool;
        System.out.println(fixedPool.getMaximumPoolSize());
    }
}
