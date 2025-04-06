import java.util.Stack;

public class reverseStack {
    public static void pushAtBottum(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottum(st, x);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size() == 0){
            int top = st.pop();
            reverseStack(st);
            pushAtBottum(st, top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        Stack<Integer> at = new Stack<>();
        while (rt.size() > 0) {
            at.push(rt.pop());
        }
        while (at.size() > 0 ) {
            st.push(at.pop());
        }
        // System.out.print(st);

        
        reverseStack(st);
        System.out.println(st);
    }
    
}
