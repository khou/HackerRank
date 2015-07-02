package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/lonely-integer
 * Created by kevin
 */

import java.util.Scanner;

public class LonelyInteger {

    public static void main(String args[]) {
        // this problem can be done with Hash as well
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // N for number of integers in the container array
        int x = 0;
        for (int i = 0; i < N; i++) {
            x = x ^ in.nextInt();
        }
        System.out.println(x);
    }
}