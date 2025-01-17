// package linkedList;
public class implementationLL {
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null; //Initializing Head with null
    public void add(int data){
        Node newNode = new Node(data); // creating New Node in which data get stored
        if(head == null){ 
            head = newNode; // if head is null So, head is newNode
        } else {
            Node temp = head; // Store head as temp
            while (head != null) { // while head is not equal to null .. repeating this task
                temp = temp.next; // traversing to the last node
            }
            temp.next = newNode; // adding Node at the end
        }
    }

    public static class linkedList {            
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
        void display(){
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.display();
    }
}
