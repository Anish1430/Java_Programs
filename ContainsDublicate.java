import java.util.*;
public class ContainsDublicate {

    public  static boolean containsDublicate(int arr[]) {
         HashSet<Integer> hs=new HashSet<>();
         for(int num : arr) {
             if(hs.contains(num))
                  return true;
               hs.add(num);
         }
         return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) {
             arr[i]= sc.nextInt();
         }
           boolean ans=containsDublicate(arr);
           System.out.println(ans);
    }
}
