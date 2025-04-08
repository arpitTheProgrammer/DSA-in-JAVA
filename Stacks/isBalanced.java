import java.util.Scanner;
import java.util.Stack;

public class isBalanced {

    // public static boolean isBalanced(String str){
    //     Stack<Character> st = new Stack<>();
    //     int size = 0;
    //     for(int i = 0; i < str.length(); i++){
    //         if(str.charAt(i) == '('){
    //             st.push(str.charAt(i));
    //             size++;
    //         }
    //         if(str.charAt(i) == ')'){
    //             st.pop();
    //             size--;
    //         }
    //     }
    //     if(size == 0){
    //         return true;
    //     }
    //     return false;
    // }

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(st.isEmpty()){
                    return "NO";
                }
                char top = st.pop();
                if(s.charAt(i) == ')' && top != '(' || s.charAt(i) == '}' && top != '{' || s.charAt(i) == ']' && top != '[' ){
                    return "NO";
                }
                
            }

        }
            
            return st.isEmpty() ? "YES" : "NO";
        }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
