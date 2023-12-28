import java.util.*;
public class TrycatchExceptionStartsHere {
    public static void main(String[] args) {
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");

        try {

            int a=10/0;   //Arithmatic Exception is occured in line number 11.....

        }catch (Exception e) {
            System.out.println("Exception is Handling in Catch Block");
        }
        System.out.println("After ArithmaticException is Occured  ");
    }
}
