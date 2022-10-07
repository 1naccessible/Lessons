package ICharQ;

public class QueueFullException extends Exception{
    int size;

    QueueFullException(int i){
        size = i;
    }

    public String toString(){
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}
