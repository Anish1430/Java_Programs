   import  java.util.*;
public class ReverseString {
        public static void reverseString(char[] s) {
            int start=0;
            int end=s.length-1;
            while(start <= end ){
                char ch=s[start];
                s[start]=s[end];
                s[end]=ch;
                start++;
                end--;
            }
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char[] s = str.toCharArray();
           reverseString(s);
        System.out.println(new String(s));
    }
}
