package DoublyLL;

import java.util.LinkedList;

public class doublyLL {
    public static class Node{
        int data;
        Node next; 
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;

    // Insert Node at Head

    public static Node inserthead(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        newNode = head;
        return head;   
    }

    // Insert Node at tail

    public static void insertTail(Node head, int data){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        temp.prev = temp;
    }

    // insert at Idx

    public static void insertAtIDX(Node head, int data, int idx){
        Node temp = head;
        for(int i = 1; i < idx; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next.prev = newNode;
        temp.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayCompleteList(Node random){
        Node temp = random;
        // Move list backward
        while(temp.prev != null){
            temp = temp.prev;
        }
        // Print the list

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    Node a = new Node(3);
    Node b = new Node(44);
    Node c = new Node(21);
    Node d = new Node(89);
    Node e = new Node(23);
    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;
    display(a);
    displayReverse(e);
    displayCompleteList(b);
    Node result = inserthead(a, 21); // Insert Head Call
    displayCompleteList(result);
    insertTail(a, 45); // Insert Tail call
    display(a);
    insertAtIDX(a, 55, 2);
    display(a);
}
    
}