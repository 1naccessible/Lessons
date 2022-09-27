package interfaceDemonstrate;

public interface Series {
    int getNext(); // возвратить следующие по порядку число
    void reset(); // сброс
    void setStart(int x); // Установить начальное значение

    //Возвратить массив, который содержит n елементов
    //распологающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n){
    int [] vals = new int[n];

    for (int i = 0; i < n; i++) {
        vals[i] = getNext();
    }
    return vals;
    }
}
