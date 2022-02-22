import java.util.Scanner;
import java.util.Scanner;

public class DayOneIsANumberPrime {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i ++) {
            int a = input.nextInt();
            boolean flag = prime (a);
         /*   if (flag) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }*/
            System.out.println(flag ? "prime" : "not prime");

        }

    }

    public static boolean prime (int a) {
        boolean flag = true;
        for (int i = 2; i * i <= a; i ++) {
            if (a % i == 0) {
                flag = false;
            }
        }
        return flag;
    }
}

/*
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Input Format
A number t
A number n
A number n
.. t number of times
Output Format
prime
not prime
not prime
.. t number of times

Constraints
1 <= t <= 10000
2 <= n < 10^9
Sample Input
5
13
2
3
4
5
Sample Output
prime
prime
prime
not prime
prime

 */

/*

import java.util.*;
public class IsANumberPrime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i < t; i ++) {
            int n = scn.nextInt();
            boolean isPrime = true;
            for(int d = 2; d <= n / 2; d ++) {
                if(n % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "prime" : "not prime");
        }
    }
}
 */