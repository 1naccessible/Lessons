package exception;

public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d +
                " не является целым числом";
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        int num[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int div[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num.length; i++) {
            try {
                if (num[i] % div[i] != 0){
                    throw new NonIntResultException(num[i],div[i]);
                }
            } catch (NonIntResultException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }
}
