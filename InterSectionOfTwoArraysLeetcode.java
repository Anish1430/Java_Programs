import java.util.*;
public class InterSectionOfTwoArraysLeetcode {
    public static int[] intersectOfTwoArray(int[] nums1, int [] nums2) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0; int j=0;
        while( i < nums1.length && j < nums2.length) {
            if(nums1[i] <  nums2[j]) {
                i++;
            }else if(nums1[i] > nums2[j]) {
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int ans[]=new int[list.size()];
        int k=0;
        while( k < ans.length) {
            ans[k]= list.get(k);
            k++;
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
              int m=sc.nextInt();
            int arr2[]=new int[m];
              for(int i=0;i<m;i++) {
                  arr2[i]= sc.nextInt();
              }
              int ans[]=intersectOfTwoArray(arr,arr2);
              for(int i=0;i<ans.length;i++) {
                  System.out.print(ans[i]+" ");
              }
    }
}
