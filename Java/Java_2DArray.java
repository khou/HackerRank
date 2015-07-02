package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-2d-array
 * Created by kevin
 */

import java.util.Scanner;

public class Java_2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 6;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = in.nextInt();
            }
        }
        int largest = Integer.MIN_VALUE;
        int current;
        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                current = calculateSum(i, j, array);
                if (current > largest) largest = current;
            }
        }
        System.out.println(largest);
    }

    static int calculateSum(int x, int y, int[][] array) { // taking center of hourglass
        int sum
                = array[x][y]
                + array[x - 1][y - 1]
                + array[x - 1][y]
                + array[x - 1][y + 1]
                + array[x + 1][y - 1]
                + array[x + 1][y]
                + array[x + 1][y + 1];
        return sum;
    }
}