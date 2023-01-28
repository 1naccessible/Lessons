package leetCode;

import java.util.Stack;

public class LongestValidPar {
    public int longestValidParentheses(String s) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    return s.length();
                }
            }
        }
        return s.length() - stack.size();
    }
}
class DemoLVP {
    public static void main(String[] args) {
    }
}