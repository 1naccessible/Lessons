package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
    public static String decoder(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                countStack.push(count);
            } else if (s.charAt(i) == '[') {
                resultStack.push(result);
                result = "";
                i++;
            } else if (s.charAt(i) == ']') {
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int count = countStack.pop();
                for (int j = 0; j < count; j++) {
                    temp.append(result);
                }
                result = temp.toString();
                i++;
            } else {
                result += s.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "ab2[b2[cd]4[e]]f";
        System.out.println(decoder(str));
    }
}
