public class ForDemo {
    public static void main(String[] args) {
        int x;

        for (x=100; x>0; x--)
            System.out.println("Loading  "+x-- +"%"); //Если хочешь что то написать после переменной то просто добавь +


        int var;

        for (var=0; var>-101; var=var--)
            System.out.println("Loading  "+var-- +"%");



        int count;

        for (count=0; count<101; count=count++)
            System.out.println("Loading  "+count++ +"%");
    }
}
