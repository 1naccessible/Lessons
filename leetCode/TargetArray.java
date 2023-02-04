package leetCode;

import java.util.*;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            answer.add(index[i], nums[i]);
        }
        int [] buff = answer.stream().mapToInt(b -> b).toArray();
        System.out.println(answer);
        return buff;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,4,3,2};
        int[] index = {0,0,1,3,1};
        createTargetArray(nums, index);
    }
}
