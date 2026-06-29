import java.util.Stack;

public class InfixToPrefix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }
        return sb.toString();
    }

    static String infixToPrefix(String exp) {

        exp = reverse(exp);

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

        return new StringBuilder(result).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(infixToPrefix("(A+B)*C"));
    }
}
