/**
 * stack
 */
import java.util.*;
public class stack {
    public String prefixToPostFix(String expression){
        Stack<String> stack = new Stack<String>();
        for(int i=expression.length()-1;i>=0;i--){
            Character currentChar=expression.charAt(i);
            if(isOperator(currentChar)){
                String firstValue=stack.pop();
                String secondValue=stack.pop();

                stack.push(firstValue+secondValue+currentChar);

            }    else{
                stack.push(currentChar.toString());
            }
        }
        return stack.peek();
    }
    private boolean isOperator(Character currentChar){
        if(currentChar=='+'||currentChar=='-'||currentChar=='*'||currentChar=='/'||currentChar=='^'|| currentChar=='%') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        stack s = new stack();
        String expression = "*-A/BC-/AKL";
        System.out.println(s.prefixToPostFix(expression));
    }

}
