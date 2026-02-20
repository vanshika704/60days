package day1;

import java.util.HashMap;

public class countoccurences {
  public static int count(int[] nums, int target) {

    HashMap<Integer, Integer> mpp = new HashMap<>();

    for(int num : nums){
        mpp.put(num, mpp.getOrDefault(num, 0) + 1);
    }

    return mpp.getOrDefault(target, 0);
}
public static int brute(int[] nums, int target) {
    int count = 0;

    for(int num : nums) {
        if(num == target) {
            count++;
        }
    }

    return count;
}

    public static void main(String[] args) {
         int nums[] = new int []{1,2,2,3,3,3,3,4,5};
         System.out.println(brute(nums, 3));
                  System.out.println(count(nums, 2));
    }
}
