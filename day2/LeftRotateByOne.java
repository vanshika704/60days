package day2;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        int temp = arr[0];   // Step 1
        
        // Step 2: shift left
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        
        // Step 3: put temp at last
        arr[arr.length - 1] = temp;
        
        // Print result
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}