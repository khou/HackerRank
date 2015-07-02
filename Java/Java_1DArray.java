package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-1d-array
 * Created by kevin
 */

import java.util.Scanner;

public class Java_1DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, m;
        int[] array;
        for (int i = 0; i < t; i++) {
            n = in.nextInt();
            m = in.nextInt();
            array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = in.nextInt();
            }
            System.out.println(move(array, 0, m) ? "YES" : "NO");
        }
    }

    static boolean move(int[] array, int index, int m) {
        int length = array.length;
        int jump = index + m;
        int increment = index + 1;
        int decrement = index - 1;
        if (jump > length - 1) return true;
        array[index] = 1; // overwrite where we have passed over
        boolean escaped = false;
        if (jump < length && array[jump] == 0) {
            escaped = move(array, jump, m);
        }
        if (!escaped && increment < length && array[increment] == 0) {
            escaped = move(array, increment, m);
        }
        if (!escaped && decrement >= 0 && array[decrement] == 0) {
            escaped = move(array, decrement, m);
        }
        return escaped;
    }
}