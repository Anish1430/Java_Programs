import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTert {
    public static void main(String[] args) {

            List<Integer> list= Arrays.asList(2,3,4,5,6,7,8);
            List<Integer> anish=list.stream().filter(n-> n%2==0).collect(Collectors.toList());
              System.out.println(anish);
    }
}
