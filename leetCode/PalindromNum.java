package leetCode;

public class PalindromNum {
    public static boolean isPalindrome(int x) {
        boolean ans = false;
        if(x<0){
            return false;
        }else {
            String str = Integer.toString(x);
            StringBuilder stringBuilder = new StringBuilder(str);
            str = stringBuilder.reverse().toString();
            double reversed = Double.parseDouble(str);
            if (x == reversed){
                ans = true;
            }
            return ans;
        }
    }
}
class DemoPalindrome{
    public static void main(String[] args) {
        System.out.println(PalindromNum.isPalindrome(121));
    }
}