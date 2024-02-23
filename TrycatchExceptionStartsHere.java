import java.util.*;
public class TrycatchExceptionStartsHere {
    public static void main(String[] args) {
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");
        System.out.println("Before dividing Using Zero");

        try {
            //The code having the Exception possibilities has to be written inside try block

       //      int b=10/0;   //Arithmatic Exception is occured in line number 11.....


            int arr[]=new int[4];
             arr[0]=5;
             arr[1]=6;
             arr[2]=7;
             arr[3]=8;
             arr[4]=9;

             //Throwable is parent class of Exception class ...and Exception class is a parent class
            //   of ArithmeticException,IndexOutOfBoundException and NullPointerException etc....
        }catch (Throwable e)  {   //we can write also ....  catch(Exception e) {

             //If you get an Exception the control will move to the Catch block ...
          //  System.out.println("Exception is Handling in Catch Block"+" "+e.getMessage());
            System.out.println(e);

        }
        System.out.println("After Dividing number by Zero ");
        System.out.println("After Dividing number by Zero ");
        System.out.println("After Dividing number by Zero ");
        System.out.println("After Dividing number by Zero ");
    }
}
