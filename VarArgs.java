public class VarArgs {
    //Метод vaTest допускает переменное число аргументов
    static void vaTest(int...a){
        System.out.println("Количсетво аргументов: " + a.length);
        System.out.println("Содержимое: ");
        for (int i = 0; i< a.length; i++)
            System.out.println("arg " + i + ": " + a[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        //Метод vaTest может вызываться с переменным числом аргументов:
        vaTest(10);         //1 аргумент
        vaTest(5,2,4);      //3 аргумента
        vaTest();               //без аргументов
        int c = 0;
        String str1 = "1000";
        System.out.println(Integer.parseInt(str1));
    }
}
