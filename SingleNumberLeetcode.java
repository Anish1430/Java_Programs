import java.util.*;
public class SingleNumberLeetcode {
       public static int singleNumber(int arr[]) {
             Arrays.sort(arr);
             int ans=0;
             for(int num : arr) {
                   ans ^=num;
             }
             return ans;
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
            int arr[]=new int[n];
              for(int i=0;i<n;i++) {
                    arr[i]= sc.nextInt();
              }
                int ans=singleNumber(arr);
             System.out.println(ans);
    }
}
