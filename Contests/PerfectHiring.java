package Contests;

/**
 * Problem Statement: https://www.hackerrank.com/contests/epiccode/challenges/perfect-hiring
 * Created by kevin
 */

import java.util.Scanner;

public class PerfectHiring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // applicant #
        int P = in.nextInt(); // patience
        int X = in.nextInt(); // negative patience;
        double patience = P;
        double multiplier;
        double highestScore = 0;
        int highestScorer = 0;
        double score;
        for (int i = 0; i < N; i++) {
            patience -= X;
            if (patience < 0) break;
            multiplier = in.nextInt();
            score = patience * multiplier;
            //System.out.println(patience);
            if (highestScore < score) {
                highestScore = score;
                highestScorer = i + 1;
                //System.out.println(highestScore);
            }
        }
        System.out.println(highestScorer);
    }
}

