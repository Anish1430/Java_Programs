import java.util.*;
public class MajorityElementNBy2InLeetcode {
      public static int majorityElement(int arr[]) {
            Arrays.sort(arr);
           int num=0;
           int count=0;
           for(int i=0;i<arr.length;i++) {
               if(arr[i] == num) {
                   count++;
               }else if(count  == 0) {
                     num=arr[i];
                       count++;
               }else {
                   count--;
               }
           }
           return num;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                 arr[i]=sc.nextInt();
            }
            int ans=majorityElement(arr);
        System.out.println(ans);
    }
}
