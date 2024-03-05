import java.util.*;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer>  arr=new ArrayList<>();
          arr.add(1);
        System.out.println(arr);
          arr.add(2);
        System.out.println(arr);
          arr.add(3);
        System.out.println(arr);
          arr.add(4);
        System.out.println(arr);
          arr.add(5);
        System.out.println(arr);

        for(int value : arr) {
            System.out.print(value+" ");
        }
          System.out.println();
        for(int i=0;i<arr.size();i++) {
            System.out.print(arr.get(i)+" ");
        }

    }
}
