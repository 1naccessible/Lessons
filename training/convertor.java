package training;

class Solution {

    static String toCamelCase(String s) {
        int indexFrom = 0;
        String convert = null;
        for (int i = 0; i < s.length(); i++) {

            int indexOne = s.indexOf("-", indexFrom);
            if (indexOne != -1) {
                indexOne += 1;
                if (s.charAt(indexOne) >= 97) {
                    char nextSymbol = s.charAt(indexOne);
                    char neededSybol = (char) (nextSymbol - 32);
                    convert = s.replace(nextSymbol, neededSybol);
                    s = convert;
                }
            } else break;
            indexFrom = indexOne;
        }


        s = s.replace("-", "");
        s = s.replace("_", "");
        return s;
    }
}

class SolutionDemo {
    public static void main(String[] args) {
        String b = "up-Wall-desert-bridge-bridge-north-Lake-Lake-Yellow-down-Yellow";
        System.out.println(Solution.toCamelCase(b));

        String s = "The_Stealth_Warrior";
        System.out.println(Solution.toCamelCase(s));
    }
}