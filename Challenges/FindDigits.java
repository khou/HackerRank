package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/find-digits
 * Created by kevin
 */

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            N = in.nextInt();
            System.out.println(count(N));
        }
    }

    static int count(int n) {
        int testNum = n;
        int counter = 0;
        while (testNum > 0) {
            if (testNum % 10 != 0) {
                if (n % (testNum % 10) == 0) counter++;
            }
            testNum /= 10;
        }
        return counter;
    }
}