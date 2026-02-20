package day2;

public class movezeroes {
    public static void main(String[] args) {

        int j = 0 ; 
        int nums[]= new int[]{1,0,2,3,4,0,8};
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
                j++;
            }
        }
    }
    
}
