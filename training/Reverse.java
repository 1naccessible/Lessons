package training;

public class Reverse {
    public static int reverse(int x) {
        boolean minus = false;
        if (x < 0) {
            minus = true;
            x = Math.abs(x);
        }
        Integer iob = x;
        String strOb = iob.toString();
        char[] nums = strOb.toCharArray();
        String str = "";
        for (int y = nums.length - 1; y >= 0; y--) {

            str += nums[y];

        }
        int reversed = 0;
        try {
            reversed = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        if (minus) {
            return -reversed;
        } else return reversed;
    }
}

class DemoReveres {
    public static void main(String[] args) {
        System.out.println(Reverse.reverse(-321));
    }
}