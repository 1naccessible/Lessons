public class Overload2 {
    void ov(byte x) {
        System.out.println("method ov(byte) consent - " + x);
    }

    void ov(int x) {
        System.out.println("method ov(int) consent - " + x);
    }

    void ov(double x) {
        System.out.println("method ov(double) consent - " + x);
    }

}

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5f;

        ob.ov(i);//Вызов метода ob.ov(int)
        ob.ov(d);//Вызов метода ob.ov(double)
        ob.ov(b);//Вызов метода ob.ov(byte)
        ob.ov(s);//Вызов метода ob.ov(int) c преобразованием типов
        ob.ov(f);//Вызов метода ob.ov(double) c преобразованием типов
    }
}
