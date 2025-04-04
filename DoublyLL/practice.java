public class practice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node a = new Node(20);
        Node b = new Node(19);
        Node c = new Node(32);
        Node d = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;
        display(a);   
    }
    
}
