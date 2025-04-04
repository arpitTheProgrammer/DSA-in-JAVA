public class LinkedList {

    public static class  Node {
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public static void removeDuplicate(Node head){
        Node temp = head;
        while (temp != null) {
            Node currNode = temp;
            while (currNode != null && currNode.next != null) {
                if(temp.data == currNode.next.data){
                    currNode.next = currNode.next.next;
                } else {
                    currNode = currNode.next;
                }
            }
            temp = temp.next;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        Node a = new Node(1);
        Node b = new Node(12);
        Node c = new Node(11);
        Node d = new Node(15);
        Node e = new Node(12);
        Node f = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        removeDuplicate(a);
        display(a);
    }
    
}
