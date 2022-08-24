public class Pwr {
    double b;
    int e;
    double val;
    //

    /**
     *Стараться избегать такого стиля програмирования:
     * Pwr(double b, int e){
     *     this.b=b
     *     this.e=e
     *     this.val=1;
     *         if (exp==0) return;
     *         for (;exp>0;exp--)this.val *= base;
     * так как в данной версии конструктора имена параметров совпадают с именами переменных экземпляра
     * а ключивое слово this используется что бы открыть их
     * }
     *
     */
    //
    Pwr(double base, int exp){
       this.b= base;
       this.e= exp;
       this.val=1;
        if (exp==0) return;
        for (;exp>0;exp--)this.val *= base;
    }

    double get_pwr(){
        return this.val;
    }
}

class PwrDemo{
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,1);
        Pwr c = new Pwr(5.7,0);

        System.out.println(x.b + " в степенни " + x.e + " equals " + x.get_pwr());
    }
}
