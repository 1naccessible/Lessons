public class StaticError {
    int denom = 3; //обычная переменная экземпляра
    static int val = 1024; // статическая переменная экземпляра

    /*
    Ошибка! К нестатическим переменным нельзя обращаться из статического метода
     */
    static int valDivDenom(){
     //return val/denom не пройдет компиляцию
        return 0;
    }
}
