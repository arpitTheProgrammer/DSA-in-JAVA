public class LLbasics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        Node head= null;

        // Print Recursively
        // public static void displayNode(Node head, int count){
        //     if(head == null ){
        //         return;
        //     }
        //     System.out.print(head.data+ " ");
        //     System.out.println(count); // Counting the Linked Elements
        //     displayNode(head.next, count+1);
        // }


        public static int countList(Node head){
            int count = 0;
             while(head != null){
                count++;
                head = head.next;
             }
             return count;
        }


        public static void displayNode(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    public static void main(String[] args) {
        Node a = new Node(34);
        Node b = new Node(21);
        Node c = new Node(12);
        Node d = new Node(43);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp  = a;

        
        // Print all Node 

        //Print in for Loops


        // for(int i = 0; i <= 5; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }


        //Print list in Do while Loops

        // do{
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // } while( temp != null);



        //


        // Print in While loops
        // int count = 0; 
        // while(temp != null){
        //     count++;
        //     // System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        // System.out.println(count);


        // displayNode(a, 1);
        System.out.println(countList(a));
    }
    
}
