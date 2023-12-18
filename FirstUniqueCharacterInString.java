import java.util.*;

public class FirstUniqueCharacterInString {
    public  static int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(i == s.lastIndexOf(ch) && i == s.indexOf(ch))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String str=sc.next();
              int ans=firstUniqChar(str);
              System.out.println(ans);
    }
}
