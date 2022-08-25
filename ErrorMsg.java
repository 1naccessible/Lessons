public class ErrorMsg {
    String msg[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутвует место на диске",
            "Выход индекса за границы диапазона"
    };

    String getErrorMsg(int i){
        if (i>=0 && i< msg.length)
            return msg[i];
        else return "Несуществующий код ошибки";
    }
}

class ErrMsg{
    public static void main(String[] args) {
        ErrorMsg ob = new ErrorMsg();

        System.out.println(ob.getErrorMsg(2) + "\n" + ob.getErrorMsg(13));
    }
}
