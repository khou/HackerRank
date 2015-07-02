package Challenges;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/insertionsort1
 * Created by kevin
 */

import java.util.Scanner;

public class InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int val = ar[ar.length - 1];
        int position = ar.length - 1;
        for (int i = ar.length - 2; i >= 0; i--) {
            if (val < ar[i]) {
                ar[i + 1] = ar[i];
                position = i;
//              This is only needed if user doesn't want to print last line twice; once before replacement
//                if((i == 0) || (val >= ar[i-1]))
//                    ar[i] = val;
                printArray(ar);
            }
        }
        ar[position] = val;
        printArray(ar);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}


