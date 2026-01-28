package day2.dsa;

import java.util.HashMap;

public class ContinuousSubarraySum {
     public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        System.out.println(checkSubarraySum(nums, k));
    }

    static boolean checkSubarraySum(int[] nums, int k) {
        if (k == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == 0 && nums[i - 1] == 0)
                    return true;
            }
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // IMPORTANT

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum % k;

            if (rem < 0) rem += k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2)
                    return true;
            } else {
                map.put(rem, i); // store FIRST occurrence only
            }
        }

        return false;
    }
}
