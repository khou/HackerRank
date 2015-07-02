package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/alternating-characters
 * Created by kevin
 */

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String test;
        int T = Integer.parseInt(in.nextLine());
        for (int i = 0; i < T; i++) {
            test = in.nextLine();
            System.out.println(cuts(test));
        }
    }

    static int cuts(String test) {
        int cuts = 0;
        int i = 1;
        int current = 0;
        while (i < test.length()) {
            if (i == test.length() - 1) {
                if (test.charAt(current) == test.charAt(i)) cuts++;
            } else if ((i + 1) == test.length()) return cuts;
            else {
                if (test.charAt(current) != test.charAt(i)) {
                    current = i;
                } else {
                    cuts++;
                }
            }
            i++;
        }
        return cuts;
    }
}

