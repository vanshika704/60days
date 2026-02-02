package day3.dsa;

public class bubblesort{
    public static void main(String[] args) {
        int arr[] = new int [] {1,3,5,2,4,6};
        int n = arr.length;
        for(int i = 0  ; i < n ; i++){
            boolean swapped = false;
           for(int j = 0  ; j < n-i-1 ; j++){
            if(arr[j]> arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= t ;
                swapped = true;
            }
            
           }
            if(!swapped) break;
          
        }
        for(int num: arr){
            System.out.print(num +  " ");
        }
    }
}