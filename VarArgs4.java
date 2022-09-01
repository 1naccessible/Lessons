public class VarArgs4 {
    static void vaTest(int...x){
        //...
    }

    static void vaTest(boolean...bo){
        //...
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);
        //vaTest(); - не пройдет компиляцию так как все параметры varargs могут иметь 0 элементов в массиве
    }
}
