package DoublyLL;

public class doublyLL {
    public static class Node{
        int data;
        Node next; 
        Node prev;
        Node(int data){
            this.data = data;
        }
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
}
    
}