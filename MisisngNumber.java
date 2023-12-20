import java.util.*;

public class MisisngNumber {
    public static int misingNumber(int arr[]) {
           int n=arr.length;
           int totalSum= n * (n + 1) / 2;
           int sum=0;
           for(int num: arr) {
               sum  +=num;
           }
           return totalSum - sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<arr.length;i++) {
              arr[i]=sc.nextInt();
          }
            int ans=misingNumber(arr);
           System.out.println(ans);
    }
}
