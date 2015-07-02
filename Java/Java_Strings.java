package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-strings
 * Created by kevin
 */

import java.util.Scanner;

public class Java_Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        String smallest = s;
        String largest = "";
        String substring;
        for (int i = 0; i < s.length() - n + 1; i++) {
            substring = s.substring(i, i + n);
            if (substring.compareTo(largest) > 0) largest = substring;
            if (smallest.compareTo(substring) > 0) smallest = substring;
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}