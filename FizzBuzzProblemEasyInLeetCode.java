import java.util.*;

public class FizzBuzzProblemEasyInLeetCode {
      public static List<String> fizzBuzz(int num) {
          List<String> list=new ArrayList<>();
            for(int i=1;i<=num;i++) {
                  if(i % 3 == 0 && i % 5 ==0) {
                      list.add("FizzBuzz");
                  }else if (i % 3 ==0){
                      list.add("Fizz");
                  }else if(i % 5 == 0) {
                       list.add("Buzz");
                  }else {
                      list.add(String.valueOf(i));
                  }
            }
            return list;
      }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
            List<String> ans=fizzBuzz(num);
            System.out.println(ans);
    }
}
