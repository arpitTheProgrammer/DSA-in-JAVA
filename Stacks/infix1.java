import java.util.Stack;

public class infix1 {
    static int precedance(char op){
		if(op == '(' || op == ')') return 1;
        if(op == '+' || op == '-') return 2;
        if(op == '*' || op == '/') return 3;
        return 0;
    }
    static int apply(int a, int b, char op){
        switch(op){
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a/b;
        }
        return 0;
    }

	public static void main(String[] args) {
		  String str = "9-5+3*4/6";
		  Stack<Integer> val =  new Stack<>();
		  Stack<Character> op = new Stack<>();
		  for(int i = 0; i < str.length(); i++){
		      char ch = str.charAt(i);
		      if(Character.isDigit(ch)){
		          val.push(ch - '0');
		      } else {
		      while(!op.isEmpty() && precedance(op.peek()) >= precedance(ch)){
		          int v1 = val.pop();
		          int v2 = val.pop();
		          char oper = op.pop();
                  val.push(apply(v2, v1, oper));
		      }
		      op.push(ch);
		      }
		  }
		  while(!op.isEmpty()){
		      int v1 = val.pop();
		      int v2 = val.pop();
		      char oper = op.pop();
              val.push(apply(v2, v1, oper));
		  }
		  System.out.println(val.peek());
	}
    

}
