package generics;

public class MyGenClass <T,V>{
    T ob1;
    V ob2;

    void set(T o){
        ob1 = o;
    }

    T myGen(T ob1){
        return ob1;
    }

//    void set(V o){
//        ob2 = o;
//    }
}
