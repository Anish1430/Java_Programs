import java.util.*;
public class PowerOfThree {
     public static boolean isPowerOfThree(int nums) {
             if(nums == 1) {
                 return true;
             }
            if(nums % 3 !=0 || nums <=0){
                  return false;
            }
            return isPowerOfThree(nums/3);
     }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
            int nums=sc.nextInt();
            boolean ans=isPowerOfThree(nums);
              System.out.println(ans);
    }
}
