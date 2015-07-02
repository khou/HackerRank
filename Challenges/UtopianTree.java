package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/utopian-tree
 * Created by kevin
 */

import java.util.Scanner;

public class UtopianTree {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] array = new int[T];
        int height = 1;
        int[] values = new int[60];
        for (int i = 1; i < 60; i++) {
            if (i % 2 == 0) {
                height += 1;
                values[i] = height;
            } else {
                height *= 2;
                values[i] = height;
            }
        }
        values[0] = 1;
        for (int i = 0; i < T; i++) {
            array[i] = in.nextInt();
            System.out.println(values[array[i]]);
        }
    }
}

