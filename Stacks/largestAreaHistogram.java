import java.util.Stack;

public class largestAreaHistogram {
    public static int LargestArea(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        st.push(n-1); 
        nse[n-1] = n;  
        // NSE
        for(int i = n-2; i >= 0; i--){
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.size() == 0) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        //Clear Stack
        while (st.size() > 0) {
            st.pop();
        }
        //PSE
        st.push(0);
        pse[0] = -1;
        for(int i = 1; i < n; i++){
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if(st.size() == 0){
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        // Area of rectangle

        int max = -1;
        for(int i = 0; i < n; i++) {
            int area = arr[i]*(nse[i] - pse[i] -1);
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 10, 4, 5, 8, 6 , 7};
        int result = LargestArea(arr);
        System.out.println(result);

    }
}
