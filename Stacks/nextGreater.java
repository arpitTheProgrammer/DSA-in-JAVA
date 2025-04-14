import java.util.Stack;

public class nextGreater {
    public static int[] nextGreaterElement(Stack<Integer> st, int n ){
        int[] res = new int[n];
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = st.get(i);
        }
        for(int i = 0 ; i < n; i++){
            result[i] = -1;
            for(int j = i+1; j < n; j++){
                if(res[j] > res[i]){
                    result[i] = res[j];
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(2);
        st.push(6);
        st.push(4);
        int[] result = nextGreaterElement(st, st.size());
        for(int i = 0; i < st.size(); i++){
            System.out.print(result[i] + " ");
        }

    }
}
