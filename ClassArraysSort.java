import java.util.Arrays;

public class ClassArraysSort {
    public static void main(String[] args) {
        int arr[] = {10, 9, 23, 7, 231, 8, 34, 3, 1, 5, 8, 3, 9, 22, 12, 25, 6, 245};
        for (int x : arr) {
            System.out.print(x + "/");
        }
        System.out.println("\n\nСтандартный порядок от меньшего к большему");
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + "/");
        }
        System.out.println("\n\nПорядок от большего к меньшему");
        Arrays.sort(arr);
        for (int x = arr.length - 1; x >= 0; x--) {
            System.out.print(arr[x] + "/");

        }
    }
}
