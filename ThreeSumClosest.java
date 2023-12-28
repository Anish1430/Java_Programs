import java.util.*;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=nums[0] + nums[1] + nums[2];

        for(int i=0;i<nums.length-2;i++) {
            int p1=i+1;
            int p2=nums.length-1;
            while(p1 < p2) {
                int sum=nums[i] + nums[p1] + nums[p2];
                if(Math.abs(target - sum) < Math.abs(target-close)) {
                    close=sum;
                }else if(sum < target) {
                    p1++;
                }else {
                    p2--;
                }
            }
        }
        return close;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++) {
              arr[i]=sc.nextInt();
          }
          int target=sc.nextInt();
            int ans=threeSumClosest(arr,target);
                System.out.println(ans);
    }
}
