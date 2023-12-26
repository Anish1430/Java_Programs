import java.util.*;

public class FindTheDifference {
      public static char findDifference(String str,String str1) {
           char ans=0;
           char ch1[]=str.toCharArray();
           char ch2[]=str1.toCharArray();
           for(char ch : ch1) {
               ans ^=ch;
           }
           for(char ch : ch2) {
               ans ^=ch;
           }
            return ans;
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2= sc.next();
         char ch=findDifference(str1,str2);
        System.out.println(ch);
    }
}
