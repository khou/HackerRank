package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/phone-book
 * Created by kevin
 */

import java.util.HashMap;
import java.util.Scanner;

public class Java_Map {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            in.nextLine();
            String key = in.nextLine();
            int value = in.nextInt();
            map.put(key, value);
        }
        in.nextLine();
        for (int i = 0; i < testCases; i++) {
            String lookupKey = in.nextLine();
            if (map.containsKey(lookupKey)) {
                System.out.println(lookupKey + "=" + map.get(lookupKey));
            } else {
                System.out.println("Not found");
            }
        }


    }
}