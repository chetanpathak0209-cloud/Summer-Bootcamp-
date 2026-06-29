import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {

        String exp = "AB+C*";
        Stack<String> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                stack.push(ch + "");

            else {

                String b = stack.pop();
                String a = stack.pop();

                stack.push("(" + a + ch + b + ")");
            }
        }

        System.out.println(stack.pop());
    }
}
