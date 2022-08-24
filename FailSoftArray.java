public class FailSoftArray {
    private int a[]; //ссылка на массив
    private int errval; //значение возвращаемое при ошибке в выполении метода get()

    public int length; //открытая переменная которая будет хранить в себе значение кол-ва
                        //элементов в массива так как массив закрытый и не удасться обратиться
                        //к нему и узнать количество элементов массива


    /**
     конструктору данного класса передаеться значение длинны массива который будет
     хранить данные, и так же передаеться значение которое будет возвращать метод get()
     при ошибке в выполнении
     */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    //метод возвращающий значение элемента массива с заданным индексом
    public int get(int index) {
        if (indexOK(index))//Отслеживание попытки выйти за границы массива
            return a[index];//возвращение значение элемента массива если метод indexOK вернул значение true
        else return errval;//возвращение значение errval если метод indexOK вернул значение false
    }

    //Метод устанавливающий значение элемента массива с заддным индексом
    public boolean put(int index, int val) {
        if (indexOK(index)) {//Отслеживание попытки выйти за границы массива
            a[index] = val; //установка значение элемента массива с заданным индексом
            return true;
        }
        return false; //сли метод indexOK вернул значение false
                     // значит запись не происходит и метод возвращает значение false
    }

    //Закрытый метод так как используется только методами находящимися с ним в одном классе
    //Метод возвращает значение true, если индекс не выходит за границы массива
    // и false если индекс выходит за границы массива
    private boolean indexOK(int index) {
        if (index >= 0 && index < length) {
            return true;
        }
        return false;
    }
}

class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        //Демонстрация правильной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);  //для обращение к закрытым элементам массива
                                    //нужно использовать открытые методы которые обращаются
                                    //к этим закрытым элементам
        }
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);  //для обращение к закрытым элементам массива
                            //нужно использовать открытые методы которые обращаются
                            //к этим закрытым элементам
            if (x != -1) {
                System.out.println(x + " ");
            }
        }
        System.out.println("");
        //обработка ошибки
        System.out.println("\nОбработка ошибок с выводом отчета");
        for (int i = 0; (i < fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("index: " + i + " вне допустимого диапазона");
            }
        }
        for (int i = 0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else System.out.println("index: " + i + " вне допустимого диапазона");
        }
    }
}
