package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-datatypes
 * Created by kevin
 */

import java.util.Scanner;

public class Java_DataTypes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            boolean hasByte = in.hasNextByte();
            boolean hasShort = in.hasNextShort();
            boolean hasInt = in.hasNextInt();
            boolean hasLong = in.hasNextLong();
            if (hasLong) {
                long num = in.nextLong();
                System.out.println("" + num + " can be fitted in:");
                if (hasByte) System.out.println("* byte");
                if (hasShort) System.out.println("* short");
                if (hasInt) System.out.println("* int");
                System.out.println("* long");
            } else {
                System.out.println(in.next() + " can't be fitted anywhere.");
            }
        }
    }
}