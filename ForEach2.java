public class ForEach2 {
    public static void main(String[] args) {
        int nums[][] = new int[3][5];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);         //задаю значение элементам масива
            }
        }
        int i = 0;
        for (int x[] : nums) { //из двумерного масива извлекается очередной одномерный масива начиная с nums[0]
            for (int y : x) {       //перебераются элеметы полученого масива
                i++; //счетчик элементов двумерного масива
                sum += y; //суммируются элементы двумерного масива
                System.out.println("Значение элемента [" + i + "] = " + y);
            }
        }
        System.out.println("Сумма = " + sum);
    }
}