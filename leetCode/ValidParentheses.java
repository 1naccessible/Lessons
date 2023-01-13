package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }
        int accumulator = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = s.length() - 2; i > 0; i--) {
            if (stringBuilder.charAt(0) == '(' && stringBuilder.charAt(i) == ')' || stringBuilder.charAt(0) == '[' && stringBuilder.charAt(i) == ']' || stringBuilder.charAt(0) == '{' && stringBuilder.charAt(i) == '}') {
                stringBuilder.deleteCharAt(0);
                stringBuilder.deleteCharAt(i);
                accumulator++;
            }
        }
        if (accumulator == stringBuilder.length() / 2) return true;
        return false;
    }
}

class DemoVP {
    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()[]{}"));
    }
}