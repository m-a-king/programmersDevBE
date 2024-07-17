package day02;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        String input = "(A(BC)DEFG";
//        String input = "(A(BC)D)EFG";
//        String input = "(A(BC)DE)F(G(H)(IJ)K)LM(N)OP(Q)R(STU)V(W(XY)Z)";
        System.out.println("Original: " + input);
        System.out.println("After: " + removeBrackets(input));
    }

    public static String removeBrackets(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean inBrackets = false;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                // 여는 괄호를 만날 때
                stack.push(c);
                inBrackets = true; // 괄호 안에 있음을 표시
            } else if (c == ')') {
                // 닫는 괄호를 만날 때
                while (!stack.isEmpty() && stack.pop() != '(' && inBrackets) {
                    // 여는 괄호를 만날 때까지 모든 문자를 스택에서 팝 (괄호 안의 문자 삭제)
                }
                inBrackets = false; // 괄호 밖으로 나옴
            } else {
                stack.push(c);
            }

            if (!stack.isEmpty()) {
                inBrackets = true;
            }

//            System.out.println(stack.toString());
//            System.out.println("inBrackets = " + inBrackets);
        }

        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}