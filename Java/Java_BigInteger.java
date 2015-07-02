package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-biginteger
 * Created by kevin
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger x = in.nextBigInteger();
        BigInteger y = in.nextBigInteger();
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));
    }
}