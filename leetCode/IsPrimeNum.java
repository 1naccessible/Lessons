package leetCode;

public class IsPrimeNum {
    public static int countPrimes(int n) {
        int accumulator = 0;
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i != 0) {
                accumulator++;
            }
        }
        return accumulator;
    }
}

class IsPrimeDemo{
    public static void main(String[] args) {
        System.out.println(IsPrimeNum.countPrimes(12));
    }
}