public class VarArgs2 {
    //здесь msg - обычный параметр
    //х - массив параметров переменной длинны
    static void vaTest(String msg, int... x) {
        System.out.println(msg + x.length);
        System.out.println("Содержимое");

        for (int i = 0; i < x.length; i++) {
            System.out.println("arg " + i + " : " + x[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Три аргумента в массиве: ", 1, 2, 3);
        vaTest("Отсутсвуют аргументы в виде массива: ");
    }
}
