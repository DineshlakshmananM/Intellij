package DSA;

import java.util.Scanner;

class Node5 {
    String data;
    Node5 next;
    Node5(String data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    Node5 top;

    void push(String data) {
        Node5 newNode = new Node5(data);
        newNode.next = top;
        top = newNode;
    }

    String pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        String data = top.data;
        top = top.next;
        return data;
    }

    String peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class lksstack {

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static int precedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            default -> 0;
        };
    }

    // Infix to Postfix
    static String infixToPostfix(String infix) {
        StackLL stack = new StackLL();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c + "");
            } else if (c == ')') {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop();
            } else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek().charAt(0))) {
                    postfix.append(stack.pop());
                }
                stack.push(c + "");
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Postfix Evaluation
    static int evaluatePostfix(String postfix) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = switch (c) {
                    case '+' -> a + b;
                    case '-' -> a - b;
                    case '*' -> a * b;
                    case '/' -> a / b;
                    default -> 0;
                };
                stack.push(result);
            }
        }
        return stack.pop();
    }

    // Postfix to Infix
    static String postfixToInfix(String postfix) {
        StackLL stack = new StackLL();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c + "");
            } else if (isOperator(c)) {
                String b = stack.pop();
                String a = stack.pop();
                stack.push("(" + a + c + b + ")");
            }
        }
        return stack.pop();
    }

    // Detect if input is infix or postfix
    static boolean isLikelyInfix(String input) {
        return input.contains("(") || input.contains(")") || input.matches(".*[0-9][+\\-*/][0-9].*");
    }

    // MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression (infix or postfix): ");
        String input = scanner.nextLine().replaceAll("\\s+", "");

        if (isLikelyInfix(input)) {
            System.out.println("Detected Infix Expression");
            String postfix = infixToPostfix(input);
            System.out.println("Postfix: " + postfix);

            if (postfix.matches("[0-9+\\-*/]+")) {
                System.out.println("Evaluated Result: " + evaluatePostfix(postfix));
            }

            System.out.println("Converted back to Infix: " + postfixToInfix(postfix));
        } else {
            System.out.println("Detected Postfix Expression");
            System.out.println("Infix: " + postfixToInfix(input));

            if (input.matches("[0-9+\\-*/]+")) {
                System.out.println("Evaluated Result: " + evaluatePostfix(input));
            }

            System.out.println("Postfix: " + input);
        }

        scanner.close();
    }
}
