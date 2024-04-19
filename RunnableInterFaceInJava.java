

class Best implements Runnable {
     public void run() {
          System.out.print("Anish is Creating avThread in java");
     }
}
public class RunnableInterFaceInJava {
    public static void main(String[] args) {
        Test t1=new Test();
         Thread th=new Thread(t1);
           th.start();
    }
}
