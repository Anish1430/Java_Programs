import java.util.*;


class Node {
    Node head;
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}
    public class LL {

        ///Add first in this case.....
    public static void main(String[] args) {
     Node n1=new Node("Anish");
        n1.addFirst("aks");
          System.out.println(n1);
    }
}
