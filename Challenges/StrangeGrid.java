package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/strange-grid
 * Created by kevin
 */

import java.util.Scanner;

public class StrangeGrid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int y; // row
        int x; // col
        c--; // c - 1
        boolean isEven;
        isEven = r % 2 == 0;
        x = isEven ? 1 : 0; // even/odd
        x += (c * 2);
        y = isEven ? (r / 2) - 1 : r / 2;
        if (y == 0) System.out.println("" + x);
        else System.out.println("" + y + "" + x);
    }
}