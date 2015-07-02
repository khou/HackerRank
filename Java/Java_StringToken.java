package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-string-token
 * Created by kevin
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_StringToken {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().replaceAll("[!,?._'@]", " ");
        StringTokenizer st = new StringTokenizer(s);
        int size = st.countTokens();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(st.nextToken());
        }
    }
}