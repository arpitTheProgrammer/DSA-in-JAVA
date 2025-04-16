import java.util.Stack;

public class prefix {
    static int precedance(char op){
        if(op == '(' || op == ')') return 1;
        if(op == '+' || op == '-') return 2;
        if(op == '*' || op == '/') return 3;
        return 0;
    }
    public static void main(String[] args) {
        // String str = "9-5+3*4/6";
        String str = "3+(1+2)*9/2";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <= 57){
                String s = "" + ch;
                val.push(s);
            } else if(ch == '('){
                op.push(ch);
            } else if(ch == ')'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);   
                if(!op.isEmpty()) op.pop();
            }
            else {
                while (!op.isEmpty() && precedance(op.peek()) >= precedance(ch)) {
                    if(op.peek() == '(') break;
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }   
                op.push(ch);
            }

        }
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        System.out.println(val.peek());
    }
}
