package exception;

public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try {
            System.out.println("\nbefore generation of exception");

            nums[0] = 10;
            System.out.println("\nthis line won't be displayed \t" + nums[0]);
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("\nВыход за границы массива!");
        }
        System.out.println("\nAfter operator catch");
    }
}
