package leetCode;

import java.util.*;

public class JavaStringCalculator {
    public static int calculate(String s) {
        String answer = "";
        char [] buff = s.toCharArray();
        ArrayList<Character> plusMinus = new ArrayList<>();
        ArrayList<Integer> intNums = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length()-1 ){
                answer+=buff[i];
                intNums.add(Integer.parseInt(answer));
                break;
            }
            if (buff[i] == '+' || buff[i] == '-' || buff[i] == '*' || buff[i] == '/' ){
                intNums.add(Integer.parseInt(answer));
                plusMinus.add(buff[i]);
                answer = "";
                continue;
            } else if (buff[i] == '(' || buff[i] == ')'){
                continue;
            }
           answer += buff[i];
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calculate("234+345"));
    }
}
