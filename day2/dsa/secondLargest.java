package day2.dsa;

public class secondLargest {
public static void main(String[] args) {
    int arr[] = new int[] {1,2,3,4,5,6};
    int max =  Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ;i++){
        if(arr[i]>max){
            secondMax = max ;
            max = arr[i];
        }
        else if (arr[i]<max && arr[i] > secondMax){
            secondMax = arr[i];
        }
    }
    System.out.println(secondMax);
}
}
