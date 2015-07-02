package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-interface
 * Created by kevin
 */

public class Java_Interface {
    // only the inner classes are needed to pass the tests
    class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisorSum(int n) {
            int sum = 0;
            for (int i = 1; i < n + 1; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    // not needed for tests
    interface AdvancedArithmetic {
        public int divisorSum(int n);
    }
}
