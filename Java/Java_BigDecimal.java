package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-bigdecimal
 * Created by kevin
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Java_BigDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<java.math.BigDecimal> list = new ArrayList<java.math.BigDecimal>();
        java.math.BigDecimal bd;
        for (int i = 0; i < n; i++) {
            bd = in.nextBigDecimal();
            list.add(bd);
        }
        Collections.sort(list, new Comparator<java.math.BigDecimal>() {

            @Override
            public int compare(java.math.BigDecimal o1, java.math.BigDecimal o2) {
                if (o1.compareTo(o2) > 0) return -1;
                else return 1;
            }
        });
        for (java.math.BigDecimal d : list) {
            if (d.compareTo(new java.math.BigDecimal(1)) < 0 && d.compareTo(new java.math.BigDecimal(0)) > 0) {
                String s = d.toPlainString().substring(1);
                System.out.println(s);
            } else {
                System.out.println(d.toString());
            }
        }
    }
}