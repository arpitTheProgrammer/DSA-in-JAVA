import java.util.Stack;

public class basicStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(21);
        st.push(44);
        st.push(32);
        st.push(58);
        // System.out.println(st.pop()); // it will extract Last Stack
        System.out.println(st.peek()); // it will print last stack
        System.out.println(st.size());
        System.out.println(st);

        // Print first Stack 

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
    }
}