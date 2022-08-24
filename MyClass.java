public class MyClass {
    private int alpha; //закрытый доступ
    public int beta; // открытый доступ
    int gamma; // доступ по умолчанию(по сути, открытый)

    void setAlpha(int a){
        alpha = a;
    }

    int getAlpha(){
        return alpha;
    }
}
class AccessDemo{
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        /*
        доступ к переменной Alpha возможен только с помощью специально предназначенных
        для этого методов
         */
        ob.setAlpha(-99);
        System.out.println("alpha = " + ob.getAlpha());

        //ob.alpha = 10;  //Ошибка: Alpha - закрытая перемення

        ob.beta = 88; // можно установить им значение так как переменная обьявленна как открытая
        ob.gamma = 99;// можно установить им значение так как переменная обьявленна как открытая
        System.out.println("beta = " + ob.beta + "\ngamma = " + ob.gamma);
    }
}
