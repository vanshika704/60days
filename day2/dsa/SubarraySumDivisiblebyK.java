package day2.dsa;

import java.util.HashMap;

public class SubarraySumDivisiblebyK {
    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // important

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int rem = prefixSum % k;

            if (rem < 0) rem += k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        System.out.println(count);
    }
}
