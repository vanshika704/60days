package day3.dsa;

public class kthlargest {
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int pivotIndex = partition(nums, left, right);

            if (pivotIndex == target)
                return nums[pivotIndex];
            else if (pivotIndex < target)
                left = pivotIndex + 1;
            else
                right = pivotIndex - 1;
        }
        return -1;
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

}
