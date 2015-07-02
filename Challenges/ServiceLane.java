package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/service-lane
 * Created by kevin
 */

import java.util.Scanner;

public class ServiceLane {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int fWay[] = new int[N];
        for (int i = 0; i < N; i++) {
            fWay[i] = in.nextInt();
        }
        int entry;
        int exit;
        int smallest = 4;
        for (int i = 0; i < T; i++) {
            entry = in.nextInt();
            exit = in.nextInt();
            for (int j = entry; j <= exit; j++) {
                if (fWay[j] < smallest) {
                    smallest = fWay[j];
                }
            }
            System.out.println(smallest);
            smallest = 4;
        }
    }
}

