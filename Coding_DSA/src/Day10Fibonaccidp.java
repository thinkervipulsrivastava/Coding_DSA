/*
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8

Constraints
0 <= n <= 45

Format
Input
A number n

Output
A number representing the nth element of fibonnaci sequence

Example
Sample Input

10

Sample Output
55
 */

import java.io.*;
import java.util.*;
public class Day10Fibonaccidp {

        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner input = new Scanner (System.in);
            int a = input.nextInt ();
            int arr [] = new int [a + 1];
            Arrays.fill (arr, -1);
            //System.out.println (fib (a));;
            //System.out.println  (fibM (a, arr));;
            System.out.println  (fibT (a, arr));
        }

        public static int fib (int a) {
            if (a == 0 || a == 1)
                return a;

            int fib1 = fib (a - 1);
            int fib2 = fib (a - 2);
            int fibn = fib1 + fib2;

            return fibn;
        }

        public static  int fibM (int a, int arr []) {
            if (a == 0 || a == 1)
                return a;
            if (arr [a] != -1)
                return arr [a];

            int fib1 =  fibM (a - 1, arr);
            int fib2 = fibM (a - 2, arr);

            int fib =  fib1 + fib2;
            arr [a] = fib;
            return fib;
        }

        public static int fibT (int a, int arr []) {

            for (int i = 0; i <= a; i ++) {
                if (i <= 1) {
                    arr [i] = i;
                    continue;
                }
                arr [i] = arr [i - 1] + arr [i - 2];
            }
            return arr [a];
        }

    }

