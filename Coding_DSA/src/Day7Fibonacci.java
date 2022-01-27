import java.util.Scanner;

public class Day7Fibonacci {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        fibonacci (a);
    }

    public static void fibonacci (int n) {
        if (n <= 0) {
            System.out.println("Base:" + n);
            return;
        }
        System.out.println(("Pre:" + n));
        fibonacci(n  - 1);
        System.out.println("In:" + n);
        fibonacci(n - 2);
        System.out.println("Post:" + n);
    }
}
