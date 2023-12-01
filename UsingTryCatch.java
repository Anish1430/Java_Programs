import java.util.*;

public class UsingTryCatch {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int marks[]=new int[3];
           marks[0]=1;
           marks[1]=2;
           marks[2]=3;
          int ind= sc.nextInt();

        try{
            System.out.println("Welcome to You Sir");
            try{
                System.out.println(marks[ind]);
            }catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Sorry This index is not Present");
                System.out.println("Exception in  Level 2");
            }
        }catch (Exception e) {
            System.out.println("Exception in  Level 1");
        }
        finally {
            System.out.println("Hello geekster i Am Creating a nested try-catch block");
        }
    }
}
