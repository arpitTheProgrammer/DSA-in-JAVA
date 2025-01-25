import java.util.LinkedList;

public class LLquestions {
    public static class Node{
        int data;
        Node next; 
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList {
    Node head = null;
    Node tail = null;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // if list is empty, new node becomes head
        } else {
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode; // link the new node at the end
        }
    }
    
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // if list is empty, new node becomes head
        } else {
            Node temp = head;
            while (temp.next != null) { // traverse to the end
                temp = temp.next;
            }
            temp.next = newNode; // link the new node at the end
        }
    }

    // Reverse Linked List

    void reverseList(){
        // hme pehle wale node element ko last mai bhejna hoga ... .next element head pe store ho jaega
        Node temp = head;
        Node next = null;
        Node prev = null;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
       head = prev;
    }

    // delete Node 

    void delete(int postion){
        Node temp = head;
        if(postion == 0){
            head = head.next;
        }
        for(int i = 0; i < postion-1; i++){
            temp = temp.next;
        }   
        temp.next = temp.next.next;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Move to the next line after displaying the list
    }
 }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(53);
        ll.add(5    );
        ll.add(512);
        ll.add(76);
        ll.insertAtEnd(12);
        ll.insertAtEnd(16);
        ll.insertAtEnd(15);
        ll.reverseList();
        ll.delete(0);
        ll.display();
    }
    
}
