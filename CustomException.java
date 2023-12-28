 import java.util.*;


class  Custom  extends Exception{
      public Custom(String str) {
          super(str);
      }
}
public class CustomException {
    public static void main(String[] args) {
        try {
             int age=-1;
             if(age < 0) {
                  throw new Custom("age cannot be Negative");
             }else {
                 System.out.println("Age is "+" "+age);
             }
        }
          catch (Custom e) {
              System.out.println("Custom Exception is Occured in this case"+" "+e.getMessage());
          }

    }
}
