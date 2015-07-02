package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/pangrams
 * Created by kevin
 */

import java.util.Scanner;

public class Pangrams {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        solver(s);
    }

    static void solver(String s) {
        boolean[] container = new boolean[26];
        int flag = 26;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.toLowerCase().charAt(i);
            if (letter != ' ')
                if (!container[letter - 97]) {
                    container[letter - 97] = true;
                    flag--;
                }
        }
        if (flag == 0) System.out.println("pangram");
        else System.out.println("not pangram");
    }
}