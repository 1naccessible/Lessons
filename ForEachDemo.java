public class ForEachDemo {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int y = -1;
        for (int x : nums) {
            sum +=x;
            y++;
            System.out.println("Значение [" + y + "] = " + x);
        }
        System.out.println("Сумма :" + sum);
        System.out.println("\n");
        y=-1;
        sum = 0;
        for (int x: nums){
            y++;
            System.out.println("Значение [" + y + "] = " + x);
            sum += x;
            if (x==5){
                System.out.println("sum = " + sum);
                break;
            }

        }
    }
}