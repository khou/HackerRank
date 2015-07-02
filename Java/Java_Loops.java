package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-loops
 * Created by kevin
 */

import java.util.Scanner;

public class Java_Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum;
        int a, b, n;
        String space;
        int power;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            sum = a;
            b = in.nextInt();
            n = in.nextInt();
            for (int j = 0; j < n; j++) {
                power = Math.round((float) Math.pow(2, j));
                sum += (power * b);
                space = (j == n - 1) ? "" : " ";
                System.out.print(sum + space);
            }
            sum = 0;
            System.out.println();
        }
    }
}