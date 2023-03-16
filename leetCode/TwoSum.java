package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> buffer = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (buffer.containsKey(nums[i])){
                return new int[]{buffer.get(nums[i]), i};
            }else {
                buffer.put(target-nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}