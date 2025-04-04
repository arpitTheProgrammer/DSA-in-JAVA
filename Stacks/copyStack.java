import java.util.Stack;
import java.util.Scanner;
public class copyStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n;
        System.out.print("Enter the Number of elements :- ");
        n = sc.nextInt();
        // System.out.println("Enter the value of Stacks");
        for(int i = 0; i < n; i++){
            System.out.print("Enter the value of " + i + " Element :- ");
            st.push(sc.nextInt());
        }
        System.out.println(st);
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0) {
            // int x = st.peek();
            // gt.push(x);
            // st.pop();
            gt.push(st.pop()); //we can also use this
        }
        // System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while (gt.size() > 0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}