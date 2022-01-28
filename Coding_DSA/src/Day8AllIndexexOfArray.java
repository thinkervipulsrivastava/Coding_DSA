import java.util.Scanner;

public class Day8AllIndexexOfArray {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr [] = new int [a];
        for (int i = 0; i < a; i ++) {
            arr [i] = input.nextInt();
        }
        int b = input.nextInt();
        int iarr [] = allIndex (arr, b, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i ++) {
            System.out.println(iarr [i]);
        }
    }

    public static int[] allIndex (int arr [], int b, int count, int fsf ) {
        if (count == arr.length) {
            return new int[fsf];
        }
        if (arr[count] == b)
            fsf++;
        int faith[] = allIndex(arr, b, count + 1, fsf);
        int arr1[] = new int[fsf];
        if (arr[count] == b) {
            faith[fsf - 1] = count;
        }
        return faith;

    }
}

/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x.
4. You are required to find the all indices at which x occurs in array a.
5. Return an array of appropriate size which contains all indices at which x occurs in array a.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
n1
n2
.. n number of elements
A number x
Output Format
Return the array of indices from the allIndices function. Display is managed for you.

Constraints
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^ 3
0 <= x <= 10 ^ 3
Sample Input
6
15
11
40
4
4
9
4
Sample Output
3
4

 */
