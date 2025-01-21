// package linkedList;
public class implementationLL {

    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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
        int size = 0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            // System.out.println();
            size++;
        }
        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while(temp != null){
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
        void insertAtBeg(int data){
            Node temp = new Node(data);
           if(head == null){
                head = temp;
                tail = temp;
           }
           else{
                temp.next = head;
                head = temp;
           }
        //    System.out.println();
        size++;
        }

        void insertAt(int data, int postion){
            Node t = new Node(data);
            Node temp = head;
            if(postion < 0){
                System.out.println("Invelid Position");
                return;
            }
            if(postion == 0){
                insertAtBeg(data);
                return;
            }
            for(int i = 0; i < postion-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }


        int getElement(int idx){
            Node temp = head;
            for(int i = 0; i < idx-1; i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
            return temp.data;
        }
        int size(){
            return size;
        }


        // Delete elment from Linked List
        void deleteElement(int idx){
            Node temp = head;
            for(int i = 0; i < idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        // Display the Node
        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(2);
        // ll.display();
        // System.out.println();
        ll.insertAtEnd(3);
        // ll.display();
        ll.insertAtEnd(4);
        // ll.display();
        // System.out.println();
        // System.out.print(ll.size());
        // System.out.println();
        ll.insertAtEnd(23);
        // ll.display();
        ll.insertAtBeg(32);
        ll.insertAtBeg(12);
        ll.insertAtBeg(13);
        ll.insertAtBeg(25);
        ll.insertAt(33, 2);
        ll.insertAt(100, 0);
        ll.insertAt(222, -1); // It will return 
        ll.display();
        ll.getElement(2);
        System.out.println(ll.size);
        ll.deleteElement(0);
        ll.display();
        // System.out.println();
        // System.out.println(ll.tail.data);
    }
}
