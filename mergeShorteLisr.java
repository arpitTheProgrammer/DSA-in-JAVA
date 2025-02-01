import java.util.Scanner;

public class mergeShorteLisr {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node mergeList(Node headA, Node headB){
        Node newNode = new Node(0);
        Node temp = newNode;
        while(headA != null && headB != null){
           if(headA.data <= headB.data){
                temp.next = headA;
                headA = headA.next;
           } else{
                temp.next = headB;
                headB = headB.next;
           }
           temp = temp.next;
        }

        if(headA != null){
            temp.next = headA;
        } else if(headB != null){
            temp.next = headB;
        }
        return newNode.next;
    }
    // Node head = null;
    static Node ListBuild(int n, Scanner sc){
        if( n == 0) return null;
        Node head = new Node(sc.nextInt());
        Node current = head;
        for(int i = 1; i < n; i++){
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        return head;
    }

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n1 = sc.nextInt();
            Node headA = ListBuild(n1, sc);

            int n2 = sc.nextInt();
            Node headB = ListBuild(n2, sc);

            Node mergeHead =  mergeList(headA, headB);
            printList(mergeHead);

        }
    }
    
}
