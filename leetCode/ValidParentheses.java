package leetCode;



import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.startsWith(")") || s.startsWith("}") || s.startsWith("]") || (s.length() % 2) != 0 || s.length() == 0) {
            return false;
        }
        char[] buff = s.toCharArray();
        Stack<Character> characterStack = new Stack<>();
        for (char character : buff) {
            switch (character) {
                case '(', '{', '[' -> characterStack.push(character);
                case ')' -> {
                    if (!characterStack.isEmpty() && characterStack.lastElement() == '(') {
                        characterStack.pop();
                    } else characterStack.push(character);
                }
                case ']' -> {
                    if (!characterStack.isEmpty() && characterStack.lastElement() == '[') {
                        characterStack.pop();
                    } else characterStack.push(character);
                }
                case '}' -> {
                    if (!characterStack.isEmpty() && characterStack.lastElement() == '{') {
                        characterStack.pop();
                    } else characterStack.push(character);
                }
            }
        }
        return characterStack.isEmpty();
    }
}

class DemoVP {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(ValidParentheses.isValid(s));
        System.out.println(ValidParenthesesMaksVersion.isValidMaksVersion(s));
    }
}

class ValidParenthesesMaksVersion {
    public static boolean isValidMaksVersion(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
            switch (stringBuilder.charAt(1)) {
                case ')' -> forCircleBracket(stringBuilder);
                case '}' -> forCurlyBracket(stringBuilder);
                case ']' -> forSquareBracket(stringBuilder);

        }
    if (stringBuilder.length() == 0) {
        return true;
    }
    return isValidMaksVersion(stringBuilder.toString());
    }

    private static void forCircleBracket(StringBuilder s) {
        if (s.indexOf(")")-1 == s.indexOf("(")){
            deletePair(s.indexOf("("),s.indexOf(")"), s);
        }
    }

    private static void forCurlyBracket(StringBuilder s) {
        if (s.indexOf("}")-1 == s.indexOf("{")){
            deletePair(s.indexOf("{"),s.indexOf("}"), s);
        }
    }

    private static void forSquareBracket(StringBuilder s) {
        if (s.indexOf("]")-1 == s.indexOf("[")){
            deletePair(s.indexOf("["),s.indexOf("]"), s);
        }
    }


    private static void deletePair(int indexFirst, int indexLast, StringBuilder s) {
        s.deleteCharAt(indexFirst);
        s.deleteCharAt(indexLast-1);

    }
}

