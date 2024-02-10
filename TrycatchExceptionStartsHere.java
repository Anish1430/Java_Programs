import java.util.*;
public class TrycatchExceptionStartsHere {
    public static void main(String[] args) {
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");

        try {
        //The code having the Exception possibilities has to be written inside try block
            int b=10/0;   //Arithmatic Exception is occured in line number 11.....

        }catch (Exception e) {

             //If you get an Exception the control will move to the Catch block ...
            System.out.println("Exception is Handling in Catch Block");
        }
        System.out.println("After ArithMaticException is Occured when Catch block is Handled the exception");
    }
}
