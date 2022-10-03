package exception;

/*
Исключение может быть сгенерированно одним методом, а перехвачено другим
 */

public class ExcTest {
    static void genException(){
        int nums[] = new int[4];

        System.out.println("До генерации исключения");

        /*
        Сгенерировать исключие в связи с выходом индекса за границы массива
         */

        nums[7] = 10;
        System.out.println("This line won't be displayed");
    }
}
