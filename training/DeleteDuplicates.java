package training;

import java.util.Arrays;

public class DeleteDuplicates {
    public static int removeDuplicates(int[] nums) {
        int howMuchDuplicates = 0;
        int[] buff;
        if (nums.length >= 1) {
            buff = new int[nums.length - 1];

            int search;
            if (nums[0] == 0) {
                search = 1;
                first:
                for (int x : nums) {
                    for (int i = 0; i < buff.length; i++) {
                        if (buff[i] == x) {
                            continue first;
                        }
                    }
                    buff[search] = x;
                    howMuchDuplicates++;
                    search++;
                }
            } else {
                search = 0;
                first:
                for (int x : nums) {
                    for (int i = 0; i < buff.length; i++) {
                        if (buff[i] == x) {
                            continue first;
                        }
                    }
                    buff[search] = x;
                    howMuchDuplicates++;
                    search++;
                }
            }
            Arrays.sort(buff);
        }


        if (nums[0] == nums[1] && nums[0] == 0) {
            return (howMuchDuplicates - 1);
        } else return howMuchDuplicates;
    }
}

class DemoDD {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(DeleteDuplicates.removeDuplicates(nums));
    }
}