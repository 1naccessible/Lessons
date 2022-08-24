import javax.swing.text.Element;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        nums[0] = -99;
        nums[1] = -200;
        nums[2] = -698;
        nums[3] = -456;
        nums[4] = -756;
        nums[5] = 321;
        nums[6] = 545;
        nums[7] = 698;
        nums[8] = 10000;
        nums[9] = 21203;
        int min, max;
        min = max = nums[0];

        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;

            System.out.println(min + "<" + max);

        }
    }
}
class MinMax2 {
    public static void main(String[] args) {
        int nums[] = {99, 100, 231, -923, -9, -12, 23, 1002, 1205, 10054};// инициализация массива
        int min, max;
        min = max = nums[0];
        System.out.println(min + "=" + max);
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
            System.out.println(min + "<" + max);
        }
    }
}
