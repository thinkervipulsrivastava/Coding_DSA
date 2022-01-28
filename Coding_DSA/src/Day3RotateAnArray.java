import java.util.Scanner;

public class Day3RotateAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int arr[] = new int[a];
        int k = input.nextInt();
        for (int i = 0; i < a; i++) {
            arr[i] = input.nextInt();
        }
        rotateAnArray(arr, k);
        display (arr);

    }



        public static void rotateAnArray ( int[] arr, int k){
            k =  k % arr.length ;
            if (k < 0)
                k = arr.length + k;
            reverse(arr, 0, arr.length - k - 1);
            reverse(arr, arr.length - k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);

        }


        public static void reverse ( int[] arr, int s, int k){
            int li = s;
            int ri = k;
            while (li < ri) {
                int temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            }
        }

        public static void display (int arr [])  {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr [i]);
        }
        }
}

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.
Input Format
Input is managed for you
Output Format
Output is managed for you

Constraints
0 <= n < 10^4
-10^9 <= a[i], k <= 10^9
Sample Input
5
1
2
3
4
5
3
Sample Output
3 4 5 1 2
 */
