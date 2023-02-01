package leetCode;

import java.util.*;

public class JavaStringCalculator {
    public static int calculate(String s) {
        int answer;
        List<Character> characterList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            characterList.add(ch);
        }
        if (characterList.indexOf('-') + 1 == characterList.indexOf('(')) {
            return 0;
        } else {
            answer = characterList.get(0) - '0';
            for (int i = 2; i < characterList.size(); i += 2) {
                if (characterList.get(i - 1) == '+') {
                    answer += characterList.get(i) - '0';
                } else if (characterList.get(i - 1) == '-') {
                    answer -= characterList.get(i) - '0';
                }

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1-(2+3)"));
    }
}
