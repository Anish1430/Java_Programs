import java.util.*;

public class ValidAnagramWithTwoStringInLeetCode {

    public static boolean isValidAnagram(String str1,String str2) {

        int count[]=new int[26]; //in alphabet we have only 26 character (A - Z)...
        for(char ch : str1.toCharArray()) {
             count[ch - 'a']++;
        }
        for(char bh : str2.toCharArray()) {
              count[bh - 'a']--;
        }
          for(int val : count) {
              if(val != 0) {
                   return false;
              }
          }
          return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String str1=sc.next();
         String str2=sc.next();
         boolean ans=isValidAnagram(str1,str2);
         System.out.println(ans);
    }
}
