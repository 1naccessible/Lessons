package training;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        // if the length of the string array is zero, return "";
        if (str.length == 0) {
            return "";
        }
        // Name the first element in string array as prefix;
        String prefix = str[0];

        //Loop from the second element in "strs" to the last one
        for (int i = 1; i < str.length; i++) {
            // If the current element contains the prefix, move to the
            // next element and do the comparison again with the prefix
            while (str[i].indexOf(prefix) != 0) {
                // Chop down the tail character of prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // Return "" when prefix is emply
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

class DemoLCP {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strings));
    }
}
