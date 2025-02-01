import java.io.*;
import java.util.*;

public class Solution { 
    
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static int compare_list(Node llist1, Node llist2){
        while(llist1 != null && llist2 != null){
            if(llist1.data != llist2.data){
                return 0;
                
            }
            llist1 = llist1.next;
            llist2 = llist2.next;
        }
        if(llist1 != null || llist2 != null){
            return 0;
        }
        return 1;
    }
    
    static Node buildList(int n, Scanner sc) {
        if (n == 0) return null;  
        Node head = new Node(sc.nextInt()); 
        Node current = head;
        
        for (int i = 1; i < n; i++) {
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        
        return head;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n1 = sc.nextInt();
            Node llist1 = buildList(n1, sc);
            
            int n2 = sc.nextInt();
            Node llist2 = buildList(n2, sc);
            
            int result = compare_list(llist1, llist2);
            System.out.println(result);
        }
        sc.close();
        // Node num1 = new Node(sc.nextInt());
        // num1.next = new Node(sc.nextInt());
        // num1.next.next = new Node(sc.nextInt());
        
        // Node num2 = new Node(sc.nextInt());
        // num2.next = new Node(sc.nextInt());
        // num2.next.next = new Node(sc.nextInt());
        // num2.next.next.next = new Node(sc.nextInt());
        // Node llist1 = num1;
        // Node llist2 = num2;
        // System.out.println(compare_list(llist1, llist2));
        // while(llist1 != null && llist2 != null){
        //     if(llist1.data == llist2.data){
        //         return 1;
        //     } else {
        //         System.out.println(0);
        //     }
        //     llist1 = llist1.next;
        //     llist2 = llist2.next;
        // }
        // while( llist1 != null){
        //     System.out.println(0);
        //     llist1 = llist1.next;   
        // }
        // while( llist1 != null){
        //     System.out.println(0);   
        //     llist2 = llist2.next;
        // }
    }
}
