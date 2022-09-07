public class ErrorMsgFinal {
    //Коды ошибок
    //константы обьявленные с помощью ключевого слова final
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXER = 3;

    String msg[] = {
            "ОШИБКА ВЫВОДА",
            "ОШИБКА ВВОДА",
            "ОТСУТСВУЕТ МЕСТО НА ДИСКЕ",
            "ВЫХОД ИНДЕКСА ЗА ГРАНИЦЫ ДИАПАЗОНА"
    };
    //Возвратить сообщение об ошибке
    String getErrorMsg(int i){
        if(i>=0 && i< msg.length)return msg[i];
        else return "НЕСУЩЕСТВУЮЩИЙ КОД ОШИБКИ";
    }
}

class FinalD{
    public static void main(String[] args) {
        ErrorMsgFinal err = new ErrorMsgFinal();

        System.out.println(err.getErrorMsg(err.DISKERR));
        System.out.println(err.getErrorMsg(err.INDEXER));
    }
}
