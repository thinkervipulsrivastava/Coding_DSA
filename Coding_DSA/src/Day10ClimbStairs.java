/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. In one move, you are allowed to climb 1, 2 or 3 stairs.
4. You are required to print the number of different paths via which you can climb to the top.

Constraints
0 <= n <= 20

Format
Input
A number n

Output
A number representing the number of ways to climb the stairs from 0 to top.

Example
Sample Input

4

Sample Output
7
 */

import java.util.Arrays;
import java.util.Scanner;

public class Day10ClimbStairs {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt ();
        int arr [] = new int [a + 1];
        Arrays.fill (arr, -1);
        //System.out.println (cs (a));
        //System.out.println (csm (a, arr));
        System.out.println (cst (a, arr));

    }

    public static int cs (int a) {

        if (a < 0)
            return 0;
        if (a == 0) {
            return 1;
        }

        int a1 =  cs (a - 1);

        int b = cs (a - 2);

        int c = cs (a - 3);

        int d = a1 + b + c;


        return d;
    }

    public static int csm (int a, int arr []) {
        if (a < 0)
            return 0;
        if (a == 0)
            return 1;
        if (arr [a] != -1)
            return arr [a];
        int a1 = csm (a - 1, arr);
        int b1 = csm (a - 2, arr);
        int c3 = csm (a - 3, arr);

        int sum = a1 + b1 + c3;

        return sum;
    }

    public static int cst (int a, int arr []) {
        if (a < 0)
            return 0;
        if (a == 0)
            return 1;

        int a2 = cst (a - 1, arr);
        int b2 = cst (a - 2, arr);
        int c3 = cst (a - 3, arr);

        int sum = a2 + b2 + c3;
        arr [a] = sum;

        return sum;
    }
}
