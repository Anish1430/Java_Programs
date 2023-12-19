import java.util.*;
public class MovingZeroes {
    public static  int[] movingZeroes(int nums[]) {
        int i=0;
        for(int num : nums) {
              if(num != 0) {
                   nums[i]=num;
                     i++;
              }
        }
          while(i < nums.length) {
                nums[i]=0;
                  i++;
          }
         return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n= sc.nextInt();
           int arr[]=new int[n];
            for(int i=0;i<n;i++) {
                  arr[i]=sc.nextInt();
            }

            int ans[]=movingZeroes(arr);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
    }
}
