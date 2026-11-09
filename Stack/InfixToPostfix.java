public class InfixToPostfix {

    public static String convert(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack operatorStack = new Stack();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isWhitespace(ch)) {
                continue;
            }
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } 
            else if (isOpenBracket(ch)) {
                operatorStack.push(ch);
            }
            else if (isCloseBracket(ch)) {
                while (!operatorStack.isEmpty() && !isMatchingPair(operatorStack.peek(), ch)) {
                    postfix.append(operatorStack.pop());
                }
                if (operatorStack.isEmpty()) {
                    throw new IllegalArgumentException("Mismatched brackets in expression.");
                }
                operatorStack.pop();
            }
            else if (isOperator(ch)) {
                while (!operatorStack.isEmpty() 
                        && isOperator(operatorStack.peek()) 
                        && precedence(operatorStack.peek()) >= precedence(ch)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            } else {
                throw new IllegalArgumentException("Unsupported character: " + ch);
            }
        }
        while (!operatorStack.isEmpty()) {
            char topChar = operatorStack.pop();
            if (isOpenBracket(topChar)) {
                throw new IllegalArgumentException("Mismatched brackets in expression.");
            }
            postfix.append(topChar);
        }

        return postfix.toString();
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}