package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/funny-string
 * Created by kevin
 */

import java.util.Scanner;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String s, r;
        for (int i = 0; i < t; i++) {
            boolean funny = true;
            s = in.nextLine();
            r = reverseString(s);
            for (int j = 0; j < s.length() - 1; j++) {
                if (calculateAbs(s.charAt(j), s.charAt(j + 1)) != calculateAbs(r.charAt(j), r.charAt(j + 1))) {
                    funny = false;
                }
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static int calculateAbs(char a, char b) {
        return Math.abs(b - a);
    }
}

