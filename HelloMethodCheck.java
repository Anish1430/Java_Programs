


public class HelloMethodCheck {

    //We can't use of "private" with "public"
    public static void main(String args[]) {
        System.out.println("Anish Kumar Sharma");
         main(10);
         main(20,30);
    }
    public static void main(int i) {
        System.out.println("Bittu is creating this"+" "+i);
    }
    public static void main(int i,int k) {
        System.out.println("Lilly is Creating this"+" " +i+" "+k);
    }
}
