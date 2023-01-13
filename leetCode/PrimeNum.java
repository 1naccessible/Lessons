package leetCode;

import java.util.*;

public class PrimeNum {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> searchDup = new HashSet<>();
        for (int x: nums) {
            searchDup.add(x);
        }
        if (searchDup.size() < nums.length){
            return true;
        }else return false;
    }
}

class PrimeDemo{
    public static void main(String[] args) {
        PrimeNum ob = new PrimeNum();
        int [] nums = {1,2,3,4,5};
        System.out.println(ob.containsDuplicate(nums));
    }
}