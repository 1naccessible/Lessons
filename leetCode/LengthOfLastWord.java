package leetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (stringBuilder.lastIndexOf(" ") == stringBuilder.length()-1){
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if (stringBuilder.isEmpty()){
            return 0;
        }else if (stringBuilder.indexOf(" ") == -1){
            return stringBuilder.length();
        }
        stringBuilder.delete(0, stringBuilder.lastIndexOf(" ")+1);

        length = stringBuilder.length();
        return length-1;
    }
}
