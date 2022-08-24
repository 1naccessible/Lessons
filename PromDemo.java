public class PromDemo {
    public static void main(String[] args) {
        {
            byte b = 10;
            int i = b * b;// приведение типов не требуется так как тип уже повышен до int

            b = 10;
            b = (byte) (b * b);// cast needed
            System.out.println("i and b: " + i + " & " + b);
        }
        /**
         * У символьных типов тоже может повышаться тип данных до целочисленного типа int
         * по этому стоит делать приведение типов при вычеслении выражения
         * что бы тип остался неизменным
         */
        {
            char ch1 = 'a', ch2 = 'b';
            ch1 = (char) (ch1 + ch2);
            System.out.println(ch1);
        }

        {
            char ch1 = 'a', ch2 = 'b';
            ch1 += ch2;
            System.out.println(ch1);
        }
    }
}
