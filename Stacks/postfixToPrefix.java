import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <=57){
                String s = "" + ch;
                val.push(s);
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                String t = ch + v2 + v1;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}
