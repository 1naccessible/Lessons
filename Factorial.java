import javax.sound.midi.Soundbank;

public class Factorial {


    //Рекурсивный метод
    int FactoR(int n){
        int result;

        if (n==1)return 1;
        result = FactoR(n-1)*n;
        return result;
    }

    //Вариант программы, вычисляющий факториал интекрактивным способом
    int FactL(int n){
        int t,result;

        result = 1;
        for (t =1;t<=n;t++)result *= t;
        return result;
    }

}
class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Вычесление рекурсивным методом");
        System.out.println("Факториал 3 равен " + f.FactoR(3));
        System.out.println("Факториал 4 равен " + f.FactoR(4));
        System.out.println("Факториал 5 равен " + f.FactoR(5));
        System.out.println();
        System.out.println("Вычесление интерактивным методом");
        System.out.println("Факториал 3 равен " + f.FactL(3));
        System.out.println("Факториал 4 равен " + f.FactL(4));
        System.out.println("Факториал 5 равен " + f.FactL(5));
    }
}
