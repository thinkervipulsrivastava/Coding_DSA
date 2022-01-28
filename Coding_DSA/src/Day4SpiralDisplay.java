import java.util.Scanner;

public class Day4SpiralDisplay {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int arr [][] = new int[n][m];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                arr [i][j] = input.nextInt();
            }
        }
        spiralDisplay (arr,n, m);
    }

    public static void spiralDisplay (int [][] arr, int n, int m) {
        int minr = 0;
        int maxr = n - 1 ;
        int minc = 0;
        int maxc = m - 1;
        int totalElement = n * m;
        int counter = 0;
        //int j = maxc;
        while (counter != totalElement) {
            for (int i = minr, j = minc; i <= maxr && counter <totalElement ; i++) {
                System.out.println(arr[i][j]);
                counter++;
            }
            minc++;

            for (int i = maxr, j = minc; j <= maxc && counter <totalElement ; j++) {
                System.out.println(arr[i][j]);
                counter++;
            }
            maxr--;

            for (int i = maxr, j = maxc; i >= minr && counter <totalElement ; i--) {
                System.out.println(arr[i][j]);
                counter++;
            }
            maxc--;

            for (int i = minr, j = maxc; j >= minc && counter <totalElement ; j--) {
                System.out.println(arr[i][j]);
                counter++;
            }
            minr++;

        }

    }

}

/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9
Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
 */
