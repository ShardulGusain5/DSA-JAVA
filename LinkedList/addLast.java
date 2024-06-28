package LinkedList;
//This is the node of this Singly LinkedList
class Node {
    int data;
    Node next;
}
//This is the LinkedList itself
class LinkedList1 {
    Node head;
    Node tail;
    int size;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.head.data + " " + this.tail.data;
    }
//function to add last element /new element to existing LL
    void addLast(int val) {
        if (size == 0) {
            Node n = new Node();
            n.data = val;
            head = n;
            tail = n;
            size = 1;
        } else {
            Node n = new Node();
            n.data = val;
            n.next = null;
            tail.next = n;
            tail = n;
            size++;
        }
    }
//function to print size of LL
    public int size ()
    {
        return size;
    }  
//function to display LinkedList 
      public void display ()
      {
        Node temp  = head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp= temp.next;
        }
        System.out.println(temp.data);
      }    
}
//the main method
public class addLast {
    public static void main(String[] args) {
        LinkedList1 L = new LinkedList1();
        L.addLast(10);
        L.addLast(20);
        L.display();
    }
}
