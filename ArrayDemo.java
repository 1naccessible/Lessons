public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[20]; //создаю массив типа int состоящий из 20 элементов
        int i;

        for (i = 0; i < 20; i++) { //индексация массивов начинается с 0
            sample[i] = i*240; //присваиваю миссиву индекс и значение сохраняемое в массиве под этим индексом
            System.out.println("Element[" + i + "]: " + sample[i]);
        }
        System.out.println(sample[14]);

    }
}
