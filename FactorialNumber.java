import java.util.*;

public class FactorialNumber {
    public static void fact(int num,int facts) {
           if(num <=1) {
               System.out.println(facts);
               return;
           }
             facts=facts * num;
            fact(num-1,facts);
    }
      public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
              fact(num,1);
      }
}
