import java.util.*;
public class TqoSum_11 {
    public static int[] twoSum(int nums[],int target) {
        int i=0; int j=nums.length-1;
        while( i < j) {
            int sum=nums[i] + nums[j];
            if(sum > target) {
                j--;
            }else if(sum < target) {
                i++;
            }else {
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
          int target= sc.nextInt();
          int ans[]=twoSum(arr,target);
            for(int i=0;i<ans.length;i++) {
                 System.out.print(ans[i]+" ");
            }
    }
}
