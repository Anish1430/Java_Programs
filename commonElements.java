import java.util.*;
public class commonElements {

    /*
    Find common elements in two ArrayLists in Java.

Input Format

first line contain N no of elements in list 1, third line contain M elements of list 2
then subsequent lines contain list elements.

Constraints

1<=N,M<=100

Output Format

print common elements with space

Sample Input 0

4
Hii Geeks for Geeks
3
Hii Geeks Gaurav

Sample Output 0

Hii Geeks Geeks
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          ArrayList<String> str1=new ArrayList<>();
          for(int i=0;i<n;i++){
               str1.add(sc.next());
          }
          int m=sc.nextInt();
             ArrayList<String> str2=new ArrayList<>();
               for(int i=0;i<m;i++){
                   str2.add(sc.next());
               }

              ArrayList<String> str3=new ArrayList<>(str1);
                str3.retainAll(str2);
                for(String element : str3) {
                    System.out.print(element+" ");
                }
    }
}
