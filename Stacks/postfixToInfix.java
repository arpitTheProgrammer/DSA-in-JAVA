import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii - 48);
            } else {
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v2 + v1);
                if(ch == '-') val.push(v2 - v1);
                if(ch == '*') val.push(v2 * v1);
                if(ch == '/') val.push(v2 / v1);
            }
        }
        System.out.println(val.peek());
    }
}
