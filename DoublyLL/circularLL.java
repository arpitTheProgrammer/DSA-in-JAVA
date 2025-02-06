public class circularLL {

    public static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    // Display circuler LL

    public static void displayCirculer(Node head){
        if(head == null){
            return;
        }
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        displayCirculer(a);
    }
    
}
