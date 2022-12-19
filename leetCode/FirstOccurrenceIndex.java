package leetCode;

public class FirstOccurrenceIndex {
    public static int strStr(String haystack, String needle) {
        int counterFirstIndex = 0;
        int counterSecondIndex = needle.length();
        try {
            if (haystack.length() == 0 || needle.length() == 0) {
                return -1;
            } else {
                do {

                    if (!haystack.substring(counterFirstIndex, counterSecondIndex).equals(needle)) {
                        System.out.println(haystack.substring(counterFirstIndex, counterSecondIndex));
                        counterFirstIndex++;
                        counterSecondIndex++;

                    } else {

                        return counterFirstIndex;

                    }
                } while (counterFirstIndex != haystack.length());
            }
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }
}

class TestFCI {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(FirstOccurrenceIndex.strStr(haystack, needle));

    }
}

