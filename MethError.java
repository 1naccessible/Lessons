public class MethError {
    static void meth(long a,int ... b){
        //some code
    }

    static void meth(byte c,int ...v){
        //some code
    }

}
class MethErrorDemo{
    public static void main(String[] args) {
        MethError.meth(1,1);
        MethError.meth(2,2);
        //MethError.meth(); - ОШИБКА НЕОПРЕДЕЛЕННОСТИ
    }
}
