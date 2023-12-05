

/*
Take an array of size N as input.

Sort the array using bubble sort.

Note: Don't use inbuilt sort function.

Input Format

An integer N, which is the size of the array.

N integers, depicting the elements of the array.

Constraints

0 <= arr.length <= 10^4

-1*10^5 <= arr[i] <= 10^5
Output Format

Return A sorted array of size N.

Sample Input 0

5
9 4 3 8 7
Sample Output 0

3 4 7 8 9

 */

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
             for(int i=0;i<n;i++) {
                   arr[i]=sc.nextInt();
             }
               int ans[]=bubbleSort(arr,n);
             for(int i=0;i<ans.length;i++) {
                   System.out.print(ans[i]+" ");
             }
    }

    private static int[] bubbleSort(int[] arr, int n) {
           for(int i=0;i<n;i++) {
                 for(int j=0;j<n-i-1;j++){

                     if(arr[j] > arr[j+1]) {
                          int temp=arr[j];
                            arr[j]=arr[j+1];
                              arr[j+1]=temp;
                     }
                 }
           }
           return arr;
    }
}
