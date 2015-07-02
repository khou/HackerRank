package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/maximizing-xor
 * Created by kevin
 */

import java.util.Scanner;

public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(), R = in.nextInt();
        System.out.println(maxXOR(L, R));
    }

    private static int maxXOR(int l, int r) {
        int q = l ^ r;
        int p = 1;
        while (q > 0) {
            q /= 2;
            p <<= 1;
        }
        return --p;
    }
}


