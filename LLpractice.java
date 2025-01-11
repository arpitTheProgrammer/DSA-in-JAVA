import java.util.Scanner;

public class LLpractice {

    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void creation()
    {
        Scanner sc = new Scanner(System.in);
        String data;
        int n;
        do{
            System.out.println("Enter the Data");
            data = sc.nextLine();
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
            } else{ 
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Press 1 for adding More value and 0 for stop");
            n = sc.nextInt();
            sc.nextLine();
        } while( n == 1);
    }

    public void traverser()
    {
        Node temp = head;
        if(head == null){
            System.out.println("LL does not exist");
        } 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void removeFirst()
    {
        if(head == null){
            System.out.println("LL Does not exist");
            return;
        }
        String deletedData = head.data;
        head = head.next;
        System.out.println("first element (" + deletedData + ") is removed ");
    }
    
    public void deleteLast()
    {
        if(head == null){
            System.out.println("LL does not exist");
            return;
        } 
        Node secondLast = head;
        Node last = head.next;
        if(head.next == null){
            head = null;
            return;
        }
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        System.out.println("the deleted element is :- " + last.data);
        secondLast.next = null;
    }
    public static void main(String[] args){
        LLpractice ll = new LLpractice();
        ll.creation();
        // ll.traverser();
        ll.removeFirst();
        ll.deleteLast();
    }
    
}
