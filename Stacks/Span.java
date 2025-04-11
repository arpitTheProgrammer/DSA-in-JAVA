import java.util.Stack;

public class Span {

    // public static int[] countSpan(Stack<Integer> st, int n){
    //     int count = 0;
    //     int[] arr = new int[st.size()];
    //     for(int i = 0; i < st.size(); i++){
    //         count = 0;
    //         int currVal = st.get(i);
    //         for(int j = 0; j < i; j++){
    //             if(currVal > st.get(j)){
    //                 count++;
    //             } 
    //             arr[i] += count;
    //         }
    //     }
    //     return arr;
    // }

    public static int[] countSpan(Stack<Integer> st, int n){
        int[] price = new int[n];
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            price[i] = st.get(i);
        }
        for(int i = 0; i < n; i++){
            while (!s.isEmpty() && price[i] >= price[s.peek()]) {
                s.pop();
            }
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek()); 

            s.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(80);
        st.push(90);
        st.push(10);
        st.push(20);
        st.push(60);
        st.push(50);
        // System.out.println(st.get(2));
        int[] result = countSpan(st, st.size());
        for(int i = 0; i < st.size(); i++){
            System.out.print(result[i] + " ");
        }
        // System.out.println(countSpan(arr, 0));
    }
}
