import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char chars : s.toCharArray()) {
            if (chars == '(' || chars == '[' || chars == '{') {
                stack.push(chars);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ( (chars == ')' && top == '(') || (chars == ']' && top == '[') || (chars == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){}";
        boolean result = new ValidParentheses().isValid(s);
        System.out.println(s + " = " + result);
    }
}
