package training;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        System.out.println(Arrays.stream(str).filter(str[1]::equals).count());
        return "1";
    }
}
class DemoLCP {
    public static void main(String[] args) {
        String[] strings = {"do","down","dog"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strings));
    }
}
