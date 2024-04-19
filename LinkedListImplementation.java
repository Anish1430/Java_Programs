import java.util.*;
public class LinkedListImplementation {

    public static class Node{
         int data;
         Node next;
         Node(int data) {
             this.data=data;
         }
    }
  public static class linkedList {
        Node head=null;
        Node tail=null;

      public  void insertAtEnd(int data) {
             Node temp=new Node(data);
              if(head == null) {
                   head=temp;
                   tail=temp;
              }else {
                  tail.next=temp;
                   tail=temp;
              }
        }
  }

    public static void main(String[] args) {
         linkedList list=new linkedList();
            list.insertAtEnd(4);
            list.insertAtEnd(5);
    }
}
