//Обращение к обьекту подкласса по ссылочной переменой суперкласса
public class XvarY {
    int a;

    XvarY(int i){
        a = i;
    }
}
class Y extends XvarY{
    int b;
    Y(int i, int j){
        super(j);
        b = i;
    }
}
class SupSubRef{
    public static void main(String[] args) {
        XvarY x = new XvarY(10);
        XvarY x2;
        Y y = new Y(5,6);

        x2 = x; //Допустимо так как обе переменные типа XvarY
        System.out.println("x2.a - " + x2.a);

        x2 = y; //Допустимо так как класс У наследует XvarY
        System.out.println("x2.a - " + x2.a);

        x2.a = 19; //Допустимо
        //x2.b = 22; //Неедопустимо так как переменная b не являеться членом класса ХvarY
    }
}
