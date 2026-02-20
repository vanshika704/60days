package day1;

public class largestelement {
    public static void main(String[] args) {
       int nums[] = new int []{1,2,3,4,5};
    int max = nums[0];
    for(int i = 0  ; i < nums.length ; i++){
 if(nums[i] > max){
            max = nums[i];
        }
    } 
   System.out.println(max); 
    }
   
    
}
