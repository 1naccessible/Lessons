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

        indexFrom = 0;
        convert = null;
        for (int i = 0; i < s.length(); i++) {

            int indexOne = s.indexOf("_", indexFrom);
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
        s = s.replace("_", "");
        return s;
    }
}
class SolutionDemo {
            public static void main(String[] args) {
                String s = "Ninja-river_Yellow-Ninja-Street-side-Black-left";
                System.out.println(s);
                System.out.println();
                System.out.println("After conversion: ");
                System.out.println();
                System.out.println(Solution.toCamelCase(s));
                s = "Ninja-river-Yellow-Ninja-Street-side-Black-left";
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println(s);
                System.out.println();
                System.out.println("After conversion: ");
                System.out.println();
                System.out.println(Solution.toCamelCase(s));

            }
    }