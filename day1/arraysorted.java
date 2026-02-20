package day1;

public class arraysorted {
    public static void main(String[] args) {
         int nums[] = new int []{1,2,3,4,5};
        for(int i= 1 ; i < nums.length;i++){
            if(nums[i]<nums[i-1]){
               System.out.println("false");
            }
        }
      System.out.println("true");
    }
    
}
