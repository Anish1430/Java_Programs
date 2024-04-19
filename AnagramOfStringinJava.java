import java.util.*;
public class AnagramOfStringinJava {
    public static void main(String[] args) {
          String str1="Bittu";
          String str2="uttiB";

           str1=str1.toLowerCase();
           str2=str2.toLowerCase();

           char[] charArray1=str1.toCharArray();
           char[] charArray2=str2.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);

           boolean result=Arrays.equals(charArray1,charArray2);

             if(result) {
                 System.out.println(str1 +" "+" "+"And"+" "+str2 + " "+ "are Anagram");
             }else {
                 System.out.println(str1 +" "+"And"+" "+str2 + " "+ "are Not Anagram");
             }
    }
}
