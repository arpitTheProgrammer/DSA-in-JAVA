import java.util.LinkedList;
import java.util.Scanner;

public class linkedList {

    // Create a Program of Linked List    
    
    static class Node
    {
        int data; // this is data
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null; // head of the Link List

    // Value from user to store in linked list
    public void creation() // For Creating a Linked List
    {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Enter the data");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        } else {    
            new_node.next = head;
            head = new_node;
        }
        System.out.println("Do You want to enter more Data press 1");
        n = sc.nextInt();
        }
        while(n == 1);
    }
    public  void traverser()
    {
        Node temp = head;
        if(head == null) {
            System.out.println("linked list Does not exists");
        } else{
            while ( temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args){
        linkedList ll = new linkedList();
        ll.creation();
        ll.traverser();
    }
    
}
