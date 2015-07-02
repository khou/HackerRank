package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/minimum-draws
 * Created by kevin
 */

import java.util.Scanner;

public class MinimumDraws {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            System.out.println(n + 1);
        }
    }
}