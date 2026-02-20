package day1;

public class linear {
    public static void main(String[] args) {
        int arr[] = new  int[]{1,2,3,4,5,6};
        int target = 6 ;
        for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
           System.out.println(i);
        }
    } 
    }
    
}
