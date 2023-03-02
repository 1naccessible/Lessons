package leetCode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;

        while(end < length){
            char ch = s.charAt(end);
            if (!set.contains(ch)){
                set.add(ch);
                end++;
                max = Math.max(max, end-start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbadsophtbfhroawerjita"));
    }
}
