package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/song-of-pi
 * Created by kevin
 */

import java.util.Scanner;

public class SongOfPi {

    static final String PI = "3141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117";
    static final int[] container = new int[PI.length()];

    public static void main(String args[]) {
        toIntArr();
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); // Number of Test Cases
        input.nextLine();
        for (int i = 0; i < T; i++) {
            String testCase = input.nextLine();
            System.out.println(solver(testCase.split(" ")));
        }
    }

    static void toIntArr() {
        for (int i = 0; i < PI.length(); i++) {
            container[i] = Character.getNumericValue(PI.charAt(i));
        }
    }

    static String solver(String[] str) {
        final String isPI = "It's a pi song.";
        final String isNotPI = "It's not a pi song.";
        boolean result = true;
        int containerIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].replaceAll("\\W", "").length() == container[containerIndex]) {
                containerIndex++;
            } else {
                result = false;
            }
        }
        return (result) ? isPI : isNotPI;
    }
}

