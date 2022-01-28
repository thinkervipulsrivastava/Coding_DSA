import java.util.ArrayList;
import java.util.Scanner;

public class Day9GetSubsequence {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(getSubsequence (a));
    }

    public static ArrayList<String> getSubsequence (String a) {
        if (a.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add ("");
            return base;
        }
        ArrayList<String> faith = getSubsequence(a.substring(1));
        ArrayList<String> ans = new ArrayList<>(faith);
        for (String s: faith) {
            ans.add (a.charAt(0) + a);
        }
        return ans;
    }
}

/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output

Constraints
0 <= str.length <= 20
Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]
 */
