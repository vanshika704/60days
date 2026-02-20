package day1;

public class runnningsum {
public static void main(String[] args) {
    int nums[] = new int []{1,2,3,4,5};
    for(int i = 1  ; i < nums.length ;i++){
        nums[i] = nums[i]+nums[i-1];
    }
   for(int num : nums){
    System.out.println(num);
   }
}
}