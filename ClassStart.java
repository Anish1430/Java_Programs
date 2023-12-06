import java.util.*;

class Movie{
     String name;
     int rating;
     int profit;
     long moneyCollection;
     String leadActor;
     String leadActress;
}
public class ClassStart {
    public static void main(String[] args) {


        Movie m1=new Movie();
        m1.name="Anish Kumar Sharma";
        m1.rating=8;
        m1.profit=5000;
        m1.moneyCollection=200000;
        m1.leadActor="Akshay Kumar";
        m1.leadActress="My Queen";
        System.out.println(m1.name);
        System.out.println(m1.rating);
        System.out.println(m1.profit);
        System.out.println(m1.moneyCollection);
        System.out.println(m1.leadActor);
        System.out.println(m1.leadActress);
    }
}
