import java.util.Stack;

public class recursively {

    //Display reverse stack using recursion
    public static void printRev(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");    
        printRec(st);
        st.push(top);
    }

    public static void printRec(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        printRec(st);
        System.out.print(top + " ");    
        st.push(top);
    }

    // Add Element in bottum

    public static void addElementBottum(Stack<Integer> st, int n){
        if(st.size() == 0){
            System.out.print(n + " ");
            return;
        }
        int top = st.pop();
        addElementBottum(st, n);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		// System.out.print(st);
		// int n = st.size();
		// int[] arr = new int[n];
		// for(int i = n-1; i>=0; i--){
		//     arr[i] = st.pop();
		// }
		// for(int i = 0; i < arr.length; i++){
		//     System.out.print(arr[i] + " ");
		// }
		// for(int i = 0; i < arr.length; i++){
		//     st.push(arr[i]);
		// }
		// System.out.print(st);
        // printRev(st);

        int n = 5; 
        addElementBottum(st, n);
    }   
}
