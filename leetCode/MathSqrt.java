package leetCode;

public class MathSqrt {
    public static int mySqrt(int x) {
        if (x == 0){
            return 0;
        }
        int ans = 1;
        for (double i = 0; i <= x; i += 0.5) {
            if (i*i > x){
                return (int) i - 1;
            }
            if (i*i == x){
                return (int) i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }
}
