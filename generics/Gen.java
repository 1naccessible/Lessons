package generics;

//Простой обобщенный класс
//Здесь Т - это параметр типа, вместо которого
//При создании обьекта будет указываться реальный существующий тип данных
public class Gen<T> {
    T ob; //Обьявить обьект типа Т

    //Передать конструктору ссылку а обьект типа Т
    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type Т - is: " + ob.getClass().getName());
    }

}

class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку на объект типа Gen<Integer>
        Gen<Integer> iob;

        // Создать объект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. Обратите внимание на автоупаковку при
        // инкапсуляции значения 88 в объекте типа Integer.
        iob = new Gen<>(88); //Автоупаковка значения в обьект типа Integer

        //Отобразить тип данных используемый в обьекте iob
        iob.showType();

        //Получить значение из обьекта iob
        //Обратить внимание на то что приведене типов здесь не требуеться
        int v = iob.getOb(); //Автораспаковка в переменную типа int значение обьекта iob
        System.out.println("value of v: " + v);

        System.out.println();

        //Создать обьекта типа Gen<String> для строк
        Gen<String> strOb = new Gen<>("Test generics");

        //Отобразить тип данных используемый в обьекте strOb
        strOb.showType();

        //Получить значение из обьекта strOb
        //Приведение типов также не требуеться
        String str = strOb.getOb();
        System.out.println("value of str: " + str);
    }
}