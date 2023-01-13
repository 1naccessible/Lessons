package leetCode;

public class HappyNumber {
    public static boolean isHappy(int n) {
        boolean answer = n == 1;
        if (answer) {
            return true;
        }
        if (n < 10 && n % 2 != 0) {
            n *= n;
        } else if (n % 2 == 0 && n < 10){
            return false;
        }

            String integerToString = Integer.toString(n);
        char[] buff = integerToString.toCharArray();
        int isHappyNumber = 0;
        for (char ch : buff) {
            String s = "" + ch;
            isHappyNumber += Math.pow(Integer.parseInt(s), 2);
        }

        return isHappy(isHappyNumber);
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.isHappy(4));
    }
}