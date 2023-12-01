import java.util.*;

/*
You have been given a random integer array/list(ARR) of size N.
Write a function that rotates the given array/list by D elements(towards the left).

Note: Change in the input array/list itself.
Input Format

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains the value of 'D' by which the array/list needs to be rotated.

Constraints

0 <= N <= 10^6 0 <= D <= N

Output Format

print the rotated array/list in a row separated by a single space.

Sample Input 0

7
1 2 3 4 5 6 7
2
Sample Output 0

3 4 5 6 7 1 2
Sample Input 1

7
1 2 3 4 5 6 7
0
Sample Output 1

1 2 3 4 5 6 7
 */

public class RotateArrayByKthStepsInLeft {

    public static void rotate(int arr[], int n, int k) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
