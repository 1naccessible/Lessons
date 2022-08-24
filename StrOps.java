public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java the beast";
        String str2 = new String(str1);
        String str3 = "Java the beasz";
        int result, index;
        char ch;
        System.out.println("Длинна str1:  " + str1.length());

        for (int i = 0;i<str1.length(); i++){
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();

        if (str1.equals(str2)){
            System.out.println("str1 equals str2");
        }else System.out.println("str1 don't equals str2");

        if(str3.equals(str1)){
            System.out.println("str3 equals str1");
        }else System.out.println("str3 don't equals str1");

        result = str1.compareTo(str3);
        if (result == 0){
            System.out.println("str1 equal str3");
        } else if (result<0) {
            System.out.println("str1 less then str3");
        }else System.out.println("str1 more then str3");

            str2 = "One Two Three One";
            index = str2.indexOf("One");
        System.out.println("Индекс первого вхождения в строку " + index);
        index = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения в строку " + index);
    }
}
