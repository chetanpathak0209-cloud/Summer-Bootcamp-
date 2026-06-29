import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String convert(String exp) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                result += ch;

            else if (ch == '(')
                stack.push(ch);

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            }

            else {
                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek()))
                    result += stack.pop();
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result += stack.pop();

        return result;
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C";
        System.out.println(convert(exp));
    }
}