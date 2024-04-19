
class Test extends Thread {
     public void run() {
          System.out.print("Anish is Creating a Thread in java");
     }
}
public class TreadsInJava {

    public static void main(String[] args) {
        Test t1=new Test();
         t1.start();
    }
}
