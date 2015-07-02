package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/insertionsort2
 * Created by kevin
 */

import java.util.Scanner;

public class InsertionSort2 {

    public static void insertionSortPart2(int[] ar) {
        int swap;
        int j;
        for (int i = 1; i < ar.length; i++) {
            j = i;
            while ((j > 0) && (ar[j - 1] > ar[j])) {
                swap = ar[j];
                ar[j] = ar[j - 1];
                ar[j - 1] = swap;
                j = j - 1;
            }
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}


