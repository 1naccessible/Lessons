public class VoidReturn {
    void MyMeth(){
        int i;
        for (i = 0;i<10;i++){
            if(i==5)return;
            System.out.println();// выполнение метода завершится как только значение переменной достигнет 5
        }
    }
    void MyMath(){
        //...
        if(5==5) return;
        //...
        if(5==4) return;
        //...
    }
}
