public class Overload {         //Перегрузка методов
    void ovldemo() { //Первая версия
        System.out.println("Without parameters");
    }

    void ovldemo(int a) { //Вторая версия
        System.out.println("only one parameter: " + a);
    }

    int ovldemo(int a, int b) { //Третья версия
        System.out.println("Two parameters: " + a + "/" + b);
        return a + b;
    }

    double ivldemo(double a, double b) { //Четвертая версия
        System.out.println("Two parameters type double: " + a + "/" + b);
        return a + b;
    }
}

class OverloadDemo{
    public static void main(String[] args) {
        Overload ob =new Overload();
        int resI;
        double resD;

        //Поочередно вызвать все версии методов
        ob.ovldemo();
        System.out.println();

        ob.ovldemo(2);
        System.out.println();

        resI = ob.ovldemo(4,6);
        System.out.println("Result call of ob.ovldemo(4,6): " + resI);
        System.out.println();

        resD = ob.ivldemo(4.15d, 12.25d);
        System.out.println("Result call of ob.ovldemo(4.15d,12.25d): " + resD);
        System.out.println();
    }
}
