public class HackerRank {


    public static class Node{
        int data;
        Node next; 
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    Node head = null;


    // Find Element at idx from tail

    public static int findFromTail(Node tail, int idx){
        //Get last element
        Node temp = tail;
        // Node prev = null;
        while(temp.next != null){
            temp = temp.next;
        }
        for(int i = 0; i < idx-1; i++){
            temp = temp.prev;
        }

        return temp.data;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // public static void displayCompleteList(Node random){
    //     Node temp = random;
    //     // Move list backward
    //     while(temp.prev != null){
    //         temp = temp.prev;
    //     }
    //     // Print the list

    //     while(temp != null){
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    // }




    public static void main(String[] args) {
    // LinkedList ll = new LinkedList();
    Node a = new Node(3);
    Node b = new Node(44);
    Node c = new Node(21);
    Node d = new Node(89);
    Node e = new Node(23);
    // a.prev = null;
    a.next = b;
    // b.prev = a;
    b.next = c;
    // c.prev = b;
    c.next = d;
    // d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;
    display(a);
    // System.out.println(findFromTail(a, 2));
    System.out.println(findFromTail(a, 2));
    

}
    

}