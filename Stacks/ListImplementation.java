public class ListImplementation {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LLStack {
    Node head = null;
    int size = 0;
    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    void displayrec(Node h){
        if(h == null) return;
        displayrec(h.next);
        System.out.print(h.data + " ");
    }
    void display(){
        displayrec(head);
        System.out.println();
    }
    // void display(){
    //     Node temp = head;
    //     while (temp != null) {
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.err.println();
    // }
    int pop(){
        Node temp = head;
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
        size--;
        return temp.data;
    }
    int size(){
        return size;
    }
    int peek(){
        if(head == null){
            System.out.println("List is Empty");
        }
        return head.data;
    }
    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(head != null){
            return true;
        }
        return false;
    }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
