/** Implement the public long matrixSum() methods that reads a 4x4 matrix from the standard input
 * (numbers are delimited by whitespace) and returns the sum of the elements in matrix.
 * It can be assumed input is correct (i.e. contains only valid numbers). */

public class Question15 {
    public static long matrixSum() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long sum = 0;

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                sum += num;
            }
        }
        scanner.close();
        return sum;
    }
}
