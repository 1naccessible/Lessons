package genericQueue;

import ICharQ.QueueEmptyException;
import ICharQ.QueueFullException;

public class QueueRealization <T> implements IGenQ<T> {
    private T[] q;

    private int putLoc, getLoc;

    QueueRealization(T[] aRef) {
        q = aRef;

        putLoc = getLoc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if (putLoc == q.length - 1) {
            throw new QueueFullException(q.length);
        }

        q[putLoc] = obj;
        putLoc++;
    }

    public T get() throws QueueEmptyException{
        if (getLoc == q.length){
            throw new QueueEmptyException();
        }
        return q[getLoc++];
    }
}