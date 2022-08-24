public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int[] nums = {1, 2, 3};
        int table[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Размер list = " + list.length);
        System.out.println("Размер nums = " + nums.length);
        System.out.println("Размер table = " + table.length);
        System.out.println("Размер table[0] = " + table[0].length);
        System.out.println("Размер table[1] = " + table[1].length);
        System.out.println("Размер table[2] = " + table[2].length);
        System.out.println("");

        for (int i =0 ; i < list.length; i++){
            list[i] = (i) * i;

    }
        System.out.println("Содержимое list: ");
        for (int i =0;i< list.length;i++)

            System.out.print( list[i] + " ");
        System.out.println();
    }
}
