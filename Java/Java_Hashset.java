package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-hashset
 * Created by kevin
 */

import java.util.HashSet;
import java.util.Scanner;

public class Java_Hashset {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            String value = in.nextLine();
            set.add(value);
            System.out.println(set.size());
        }
    }
}