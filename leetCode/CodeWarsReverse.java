package leetCode;

import java.util.List;
import java.util.Stack;

public class CodeWarsReverse {
    public static String reverseWords(final String original){
        Stack<Character> characterList = new Stack<>();
        for (char ch: original.toCharArray()) {
            characterList.add(ch);
        }
        String output = "";
        for (int i = characterList.size()-1; !characterList.isEmpty(); i++) {
            output += characterList.pop();
        }
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        reverseWords("[ataK  dluohs   sihT  .noitulos  esac   .noitulos  .noitulos  diova   si   ataK   evah  esac  dedocodrah diova a   evah evah  a modnar evah  dedocodrah   ot modnar  dedocodrah evah]> but was:<[evah dedocodrah  modnar ot   dedocodrah  evah modnar a  evah evah   a diova dedocodrah  esac  evah   ataK   si   diova  .noitulos  .noitulos   esac  .noitulos  sihT   dluohs  ataK]");
    }
}
