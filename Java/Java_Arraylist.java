package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-arraylist
 * Created by kevin
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList> listContainer = new ArrayList<ArrayList>();
        ArrayList<Integer> integerList;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            integerList = new ArrayList<Integer>();
            for (int j = 0; j < d; j++) {
                integerList.add(in.nextInt());
            }
            listContainer.add(integerList);
        }
        // query
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            try {
                if (listContainer.get(x).get(y) != null) {
                    System.out.println(listContainer.get(x).get(y));
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}