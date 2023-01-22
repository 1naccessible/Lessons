package leetCode;

public class IsPrimeNum {
    static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrimes(int n) {
        int accumulator = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)){
                accumulator++;
            }
        }
        return accumulator;
    }
}

class IsPrimeDemo{
    public static void main(String[] args) {
        System.out.println(IsPrimeNum.countPrimes(1500000));
    }
}