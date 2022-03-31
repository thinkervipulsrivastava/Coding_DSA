import java.util.Scanner;
import java.util.Stack;

/**
 * 1. You are given a string exp representing an expression.
 * 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
 * 3. But, some of the pair of brackets maybe extra/needless.
 * 4. You are required to print true if you detect extra brackets and false otherwise.
 *
 * e.g.'
 * ((a + b) + (c + d)) -> false
 * (a + b) + ((c + d)) -> true
 * Input Format
 * A string str
 * Output Format
 * true or false
 * Constraints
 * 0 <= str.length <= 100
 *
 * Sample Input
 * (a + b) + ((c + d))
 * Sample Output
 * true
 */

public class Day13DuplicateBracket {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        String st = input.nextLine ();
        System.out.println(duplicateBracket (st));
    }

    public static boolean duplicateBracket (String st) {
        Stack <Character> stack = new Stack <>();

        for (int i = 0; i < st.length(); i ++) {
            char ch = st.charAt(i);
            if (ch == ')') {
                if (stack.peek () == '(' ) {
                    return true;

                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }
}
