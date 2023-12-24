import java.util.*;
public class HappyNumber {
      public static boolean happyNumber(int num) {
           Set<Integer> set =new HashSet<>();
           while(num != 1 && !set.contains(num)) {
                set.add(num);
                int sum=0;
                while(num != 0) {
                    int digit = num % 10;
                     sum +=digit * digit ;
                      num /=10;
                }
                  num =sum;
           }
             if(num == 1) {
                 return true;
             }
             return false;
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
            boolean ans=happyNumber(n);
        System.out.println(ans);
    }
}
