import java.util.Scanner;

public class Day5SaddlePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[][] = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = input.nextInt();
            }

            saddlePrice(arr);
        /*if ((saddlePrice(arr) == -1)) {
            System.out.println("Invalid");
        } else {
            System.out.println("Hi " + saddlePrice(arr));
        }*/
        }
    }

    public static int saddlePrice(int arr[][]) {
        return minInRowAndMaxInCol(arr);

    }

    public static int minInRowAndMaxInCol(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            int minCol = 0;

            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][minCol])
                    minCol = j;
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][minCol] > arr[i][minCol])
                    flag = false;
                    break;
            }
            if(flag == true)
                System.out.println(arr[i][minCol]);
                return arr[i][minCol] ;



        }
        return -1;

    }
}


/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41
 */
