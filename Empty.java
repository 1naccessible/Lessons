public class Empty {
    public static void main(String[] args) {
        int y = 0;
        int c;
        int u=0;
        for (int x = 0; x<5;){
            System.out.println("итерация указана в теле цикла " + x);
            x++;
        }
        for (;y<5;y++){
            System.out.println("инициализация не указана в определении цикла " + y);
        }
        for (c = 0;;c++){
            System.out.println("условие не указано в определении цикла что делает его бесконечным " + y);
            if (c==10)break;
        }
        for (;;){
            System.out.println("пример просто бесконечного цикла " );
            u++;
            if (u==10)break;
        }
    }
}
