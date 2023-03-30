/**
 * stack
 */
import java.util.*;
public class stack {
    public String postFixToPreFix(String expression){
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<expression.length();i++){
            Character currentChar=expression.charAt(i);
            if(isOperator(currentChar)){
                String firstValue=stack.pop();
                String secondValue=stack.pop();

                stack.push(currentChar+secondValue+firstValue);

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
        String expression = "AB+CD-*";
        System.out.println(s.postFixToPreFix(expression));
    }

}
