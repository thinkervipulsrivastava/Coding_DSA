import java.util.Scanner;

public class Day7PrintInDe {

        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            printIncreasingDecreasing (a);
        }

        public static void printIncreasingDecreasing (int a) {
            if (a == 0)
                return;
            printIncreasingDecreasing(a - 1);
            System.out.println(a);
           // printIncreasingDecreasing();
        }
    }

/*
1
2
3
4
5
5
4
3
2
1

 */

