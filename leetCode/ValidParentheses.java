package leetCode;

public class ValidParentheses {
    public static boolean isValid(String s) {
        boolean ans = false;
        char[] buff = s.toCharArray();
        int note = 0;
        if (buff.length % 2 != 0) {
            return false;
        } else {
            for (char x : buff) {
                if(x == '(' || x == '[' || x == '{'){
                    note += 1;
                }else {
                    note -= 1;
                }
                if (note == -1){
                    break;
                }
            }

        }
        if (note == 0){
            ans = true;
        }
        return ans;
    }
}

class DemoVP {
    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("(()[]{})"));
    }
}