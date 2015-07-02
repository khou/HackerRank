package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-exception-handling
 * Created by kevin
 */

public class Java_ExceptionHandling {
    // only the inner classes are needed to pass the tests
    class myCalculator {

        public int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }
            return Math.round((float) Math.pow(n, p));
        }
    }
}
