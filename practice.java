import java.util.Scanner;

public class practice {
    static class Node
    {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }   
    Node head = null;
    // public void creation()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     String data;
    //     int n;
    //     do{
    //         System.out.println("Enter the data");
    //         data = sc.nextLine();
    //         Node new_node = new Node(data);
    //         if(head == null){
    //             head = new_node;
    //         } else {
    //             new_node.next = head;
    //             head = new_node;
    //         }
    //         System.out.println("Enter 1 to add data and 0 to exit");
    //         n = sc.nextInt();
    //         sc.nextLine();
    //     } 
    //     while( n == 1);
    // }

    public void traverser()
    {
        Node temp = head;
        if(head == null){
            System.out.println("Linked List does not exists");
        } else {
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        }
    }

    public void fromLast()
    {

        Scanner sc = new Scanner(System.in);
        String data;
        int n;
        do{
            System.out.println("enter the data");
            data = sc.nextLine();
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }   
            currNode.next = newNode;
        }
            System.out.println("Enter 1 to Enter more Value,  Press 0 to exit");
            n = sc.nextInt();
            sc.nextLine();
        } while (n == 1);

    }

    
    // add-elemnt on the First position
    public static void main(String[] args){
        practice ll = new practice();
        // ll.creation();
        ll.fromLast();
        ll.traverser();
    }
    
}
