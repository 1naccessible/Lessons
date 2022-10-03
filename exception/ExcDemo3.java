package exception;

public class ExcDemo3 {
    public static void main(String[] args) {
        int arr[] = {4,8,16,32,64,128};
        int divider[] = {2,0,4,16,0,8};

        for (int i = 0; i< arr.length; i++){
            try {
                System.out.println(arr[i]/divider[i]);
            }
            catch (ArithmeticException exception){
                System.out.println("Деление на ноль!");
            }
        }
    }
}
