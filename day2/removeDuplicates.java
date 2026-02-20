package day2;

public class removeDuplicates {
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,4,5,6};
        int n = arr.length;

        if(n == 0) return;

        int j = 0;  // unique element index

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        // Print only unique part
        for(int i = 0; i <= j; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLength of unique array: " + (j+1));
    }
}