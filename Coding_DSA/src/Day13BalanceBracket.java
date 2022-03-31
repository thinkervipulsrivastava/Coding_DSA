import java.util.Scanner;
import java.util.Stack;

/**
 * 1. You are given a string exp representing an expression.
 * 2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
 *
 * e.g.
 * [(a + b) + {(c + d) * (e / f)}] -> true
 * [(a + b) + {(c + d) * (e / f)]} -> false
 * [(a + b) + {(c + d) * (e / f)} -> false
 * ([(a + b) + {(c + d) * (e / f)}] -> false
 * Input Format
 * A string str
 * Output Format
 * true or false
 *
 * Constraints
 * 0 <= str.length <= 100
 * Sample Input
 * [(a + b) + {(c + d) * (e / f)}]
 * Sample Output
 * true
 */

public class Day13BalanceBracket {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        System.out.println (balanceBracket (st));
    }

    public static boolean balanceBracket (String str) {
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    handleCase (stack, '(');


                } else if (ch == '{') {

                } else if (ch == '[') {

                }
            }
        }
    }

    public static boolean handleCase (Stack<Character> stack, Character case) {
        if (stack.size() == 0){
            return false;
        } else if (stack.peek() != case) {
            return false;
        } else  {
            stack.pop()
        }
    }
}
