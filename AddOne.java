import java.util.*;

public class AddOne {
    public static int[] addOne(int arr[]) {
          for(int i=arr.length-1;i>=0;i--) {
              if(arr[i] < 9 ){
                  arr[i]++;
                  return  arr;
              }else {
                  arr[i]=0;
                  if(i == 0) {
                      arr=new int[arr.length + 1];
                      arr[0]=1;
                  }
              }
          }
          return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[arr.length];
          ans=addOne(arr);
          for(int i=0;i<ans.length;i++) {
              System.out.print(ans[i]+" ");
          }
    }
}
