import java.util.*;
public class MinimumChangesToMakeAlternatingBinaryString {
      public static int minOperations(String str) {
            int count0=0;
            int count1=0;
            for(int i=0;i<str.length();i++) {
                if(i % 2 == 0) {
                    if(str.charAt(i)=='0') {
                          count1++;
                    }else {
                        count0++;
                    }
                }else {
                    if(str.charAt(i)=='1'){
                          count1++;
                    }else {
                        count0++;
                    }
                }
            }
            return Math.min(count1,count0);
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          String str=sc.next();
          int ans=minOperations(str);
           System.out.println(ans);
    }
}
