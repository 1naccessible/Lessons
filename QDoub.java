public class QDoub {
    double q[];
    int input, output;

    QDoub(int size) {
        q = new double[size + 1];
        input = output = 0;
    }

    void put(double num) {
        if (input == q.length - 1) {
            System.out.println(" - Очередь заполнена:");
            return;
        }
        input++;
        q[input] = num;
    }

    double get() {
        if (input == output) {
            System.out.println(" - Очередь пуста");
            return 0;
        }
        output++;
        return q[output];
    }
}

class QDoubleDemo {
    public static void main(String[] args) {
        QDoub nums26 = new QDoub(100);
        QDoub nums5 = new QDoub(5);
        int i;
        double doub;
        System.out.println("Использование очереди nums26 для coхранения чисел");
        for (doub = 0; doub < 30; doub += 0.5d) {
            nums26.put(doub);
        }
        System.out.println("содержимое очереди nums26:");
        for (i = 0; i < 30; i++) {
            doub = nums26.get();
            if (doub != 0) System.out.println(doub + " ");
        }

        System.out.println();

        System.out.println("Использование очереди num5 для генерации ошибок");
        for (doub = 0; doub < 3d; doub += 0.5d) {
            System.out.println("попытка сохранения числе - " + (14.5d - doub));
            nums5.put(14.5d - doub);

        }
        System.out.println("содержимое очереди nums5:");
        for (i = 0; i < 6; i++) {
            doub = nums5.get();
            if (doub != 0) System.out.println(doub);
        }

    }
}
