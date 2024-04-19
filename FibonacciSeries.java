import java.util.*;

public class FibonacciSeries {

    public static void fibonacci(int n) {
          int a=0;
          int b=1;
          System.out.println("Fibonacci series up to n"+" "+ n +" ");
           for(int i=0;i<n;i++) {
               System.out.print(a + " ");
                int sum=a + b;
                  a=b;
                  b=sum;
           }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
            fibonacci(n);

    }
}
