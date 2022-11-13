package training;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        String gotIt = "";
        String gotIt1 = "";
        String gotIt2 = "";
        String gotIt3 = "";
        for (int x = 0; x < str.length; x++) {
            for (int i = 0; i < str[x].length(); i++) {
                String abc = str[x].substring(0, i);
                try {
                    if (str[x].startsWith(abc) == str[x + 1].startsWith(abc)) {
                        gotIt1 = abc;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    try {

                        if (str[x].startsWith(abc) == str[x - 1].startsWith(abc)) {
                            gotIt2 = abc;
                        }
                    } catch (ArrayIndexOutOfBoundsException ex) {

                        gotIt3 = str[x];

                    }
                }
            }

            if (gotIt1.length() > gotIt2.length() && gotIt1.length() > gotIt3.length()) {
                gotIt = gotIt1;
            } else if (gotIt1.length() < gotIt2.length() && gotIt2.length() > gotIt3.length()) {
                gotIt = gotIt2;
            } else if (gotIt1.length() < gotIt2.length() && gotIt2.length() == gotIt3.length()) {
                gotIt = gotIt3;
            } else if (gotIt1.length() == gotIt2.length() && gotIt2.length() == gotIt3.length()) {
                gotIt = gotIt1;
            } else if (gotIt3.length() > gotIt2.length() && gotIt3.length() > gotIt1.length()) {
                gotIt = gotIt3;
            } else if (gotIt1 != gotIt2 && gotIt1 != gotIt3) {
                gotIt = gotIt1;
            }

        }
        return gotIt;
    }
}

class DemoLCP {
    public static void main(String[] args) {
        String[] strings = {"reflower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strings));
    }
}
