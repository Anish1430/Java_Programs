import java.util.*;
public class NumberOf1Bits {

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int input = scanner.nextInt();
          int  ans=hammingWeight(input);
        System.out.println(ans);
    }
}
