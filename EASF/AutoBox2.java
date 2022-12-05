package EASF;

public class AutoBox2 {
    static void m(Integer v){
        System.out.println("m() get: " + v);
    }

    static int m2(){
        return 10;
    }

    static Integer m3(){
        return 99;
    }

    public static void main(String[] args) {
        //Передача методу m() значения типа int.
        //Метод m() принимает параметр типа Integer,
        //поэтому значение int автоматически упаковывается.
        m(99);

        // Объект iOb получает значение типа int, возвращаемое
        // методом m2(). Это значение автоматически упаковывается,
        // чтобы его можно было присвоить объекту iOb.
        Integer iob = m2();
        System.out.println("value getting from method m2(): " + iob);

        //метод mЗ() возвращает значение типа Integer, которое
        //автоматически распаковывается и преобразуется в тип int.
        int i = m3();
        System.out.println("value getting from method m3(): " + i);

        // Методу Math.sqrt() в качестве параметра передается
        // объект iOb, который автоматически распаковывается, а его
        // значение повьшается до типа double, требующегося для
        // выполнения данного метода.
        iob = 100;
        System.out.println("square root of a iob: " + Math.sqrt(iob));
    }
}
