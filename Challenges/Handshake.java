package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/handshake
 * Created by kevin
 */

import java.util.Scanner;

public class Handshake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int nC2;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            nC2 = (((int) Math.pow(n, 2)) - n) / 2;
            System.out.println(nC2);
        }
    }
}