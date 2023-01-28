package leetCode;

import java.util.*;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);
        for (int x : nums) {
            integerList.add(x);
        }
        Set<Integer> integerSet = new HashSet<>(integerList);
        for (Integer x : integerSet) {
            if (integerList.lastIndexOf(x) + 1 - integerList.indexOf(x) > integerList.size() / 3) {
                answer.add(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] ex = {3, 2, 3};
        System.out.println(majorityElement(ex));
    }
}

