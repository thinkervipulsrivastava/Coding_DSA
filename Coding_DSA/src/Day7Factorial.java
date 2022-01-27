import java.util.Scanner;

public class Day7Factorial {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(factorial (a));
    }

    public static int factorial (int a) {
        if (a == 0)
            return 1;
   /*     int temp = factorial(a - 1);
        return a * temp;*/
         return a * factorial( a - 1);

    }
}

/*
1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
factorial of n

Constraints
0 <= n <= 10
Sample Input
5

Sample Output
120
 */