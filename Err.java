public class Err {
    String msg; //сообщене об ошибке
    int severity;//уровень серьезности ошибки

    Err(String m, int s){
        msg = m;
        severity = s;
    }
}

class ErrorInfo{
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутсвует место на диске",
            "Выход индекса за границы диапазона"
    };

    int howbad[] = {3,3,2,4};

    Err getErrorMsg(int i){ // Возврат обьекта класса Err
            if(i>=0 && i< msgs.length) {
                return new Err(msgs[i], howbad[i] );
            }
            else return new Err("Несуществующий код ошибки", 0);
    }
}
class ErrInfo{
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e; //ссылка на обьект Err

        e = err.getErrorMsg(2); //присваиваю ссылке e обьект Err с аргументами msgs[2] howbad[2]
        System.out.println(e.msg + " - lvl: " + e.severity);

        e = err.getErrorMsg(19);//присваиваю ссылке e обьект Err с аргументами msgs[19] howbad[19]
        System.out.println(e.msg + " - lvl: " + e.severity);
    }
}
