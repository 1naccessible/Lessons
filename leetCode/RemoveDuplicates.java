package leetCode;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        Set<Integer> buff = new TreeSet<>();
        for (int num : nums) {
            buff.add(num);
        }
        int counter = 0;
        int[] ready = new int[nums.length];
        for (Integer integer: buff) {
            ready[counter++] = integer;
        }
        return ready;
    }
}
