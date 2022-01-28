import java.util.Scanner;

public class Day4RingRotate {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int shell = input.nextInt();
        int rotate = input.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < b; j ++) {
                arr [a][b] = input.nextInt();
            }
        }
        rotateShell (arr, shell, rotate);
        // reading value from array and storing in 1d array
        // rotate
        // writing value back to 2 d array from 1 d array

    }

    public static void rotateShell (int arr[][], int shell, int rotate) {
       // int arr1 [] = readValue (arr);
        //rotate (arr1, rotate);

    }

    public static void rotate (int arr [], int rotate) {
        rotate = rotate % arr.length;
        if (rotate < arr.length)
            rotate = arr.length + rotate;
            reverse (arr, 0, arr.length - rotate - 1);
            reverse (arr, arr.length - rotate, arr.length - 1 );

    }

    public static void reverse (int arr [], int s, int e ) {
        int li = s;
        int ri = e;
        while (li < ri ) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
}

/*
You are given a n*m matrix where n are the number of rows and m are the number of columns.
You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
Output Format
output is handled by display function


Constraints
        1 <= n <= 10^2
        1 <= m <= 10^2
        -10^9 <= e11, e12, .. n * m elements <= 10^9
        0 < s <= min(n, m) / 2
        -10^9 <= r <= 10^9
        Sample Input
        5
        7
        11
        12
        13
        14
        15
        16
        17
        21
        22
        23
        24
        25
        26
        27
        31
        32
        33
        34
        35
        36
        37
        41
        42
        43
        44
        45
        46
        47
        51
        52
        53
        54
        55
        56
        57
        2
        3
        Sample Output
        11 12 13 14 15 16 17
        21 25 26 36 46 45 27
        31 24 33 34 35 44 37
        41 23 22 32 42 43 47
        51 52 53 54 55 56 57
*/