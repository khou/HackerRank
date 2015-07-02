package Java;

/**
 * Problem Statement: https://www.hackerrank.com/challenges/java-stack
 * Created by kevin
 */

import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {

    public static void main(String[] args) {
        Stack<Character> weHave = new Stack<Character>();
        Stack<Character> lookingFor = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        boolean isBalanced = false;
        while (in.hasNext()) {
            weHave.clear();
            lookingFor.clear();
            String s = in.nextLine();
            int last = s.length() - 1;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (weHave.isEmpty()) {
                    weHave.push(ch);
                    if (ch == '[') lookingFor.push(']');
                    else if (ch == '{') lookingFor.push('}');
                    else if (ch == '(') lookingFor.push(')');
                    else if (ch == ']') lookingFor.push('[');
                    else if (ch == '}') lookingFor.push('{');
                    else if (ch == ')') lookingFor.push('(');
                    else {
                        lookingFor.push(ch);
                    }
                }
                if (lookingFor.peek() != ch) {
                    weHave.push(ch);
                    if (ch == '[') lookingFor.push(']');
                    else if (ch == '{') lookingFor.push('}');
                    else if (ch == '(') lookingFor.push(')');
                    else if (ch == ']') lookingFor.push('[');
                    else if (ch == '}') lookingFor.push('{');
                    else if (ch == ')') lookingFor.push('(');
                    else {
                        lookingFor.push(ch);
                    }
                } else {
                    lookingFor.pop();
                    weHave.pop();
                    if (lookingFor.size() == 1 && weHave.size() == 1) {
                        lookingFor.pop();
                        weHave.pop();
                    }
                }
                if (lookingFor.isEmpty()) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                }
            }
            System.out.println(isBalanced);
        }
    }
}
