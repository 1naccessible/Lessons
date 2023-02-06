package lambda;
interface StringFunc<S>{
    S func(S s);
}

public class LambdaArgumentDemo {
    static String changeStr(StringFunc<String> sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "лямбда выражениыя расширяют Java";
        String outStr;

        StringFunc<String> reverse = s -> {
            String result = "";
            for (int i = s.length()-1; i >= 0 ; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println(outStr);


        System.out.println();
        outStr = changeStr(s -> s.replace(" ", "_"), inStr);
        System.out.println(outStr);


        System.out.println();
        outStr = changeStr(s -> {
            String result = "";
            char ch;

            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                if (Character.isUpperCase(ch)){
                    result += Character.toLowerCase(ch);
                } else {
                    result += Character.toUpperCase(ch);
                }
            }
            return result;
        }, inStr);
        System.out.println(outStr);

        outStr = changeStr(n -> n.replace(" ", ""), inStr);
        System.out.println(outStr);
    }
}
