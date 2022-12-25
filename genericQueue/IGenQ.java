package genericQueue;

import ICharQ.QueueEmptyException;
import ICharQ.QueueFullException;

public interface IGenQ <T>{

    void put (T ch) throws QueueFullException;

    T get () throws QueueEmptyException;
}
