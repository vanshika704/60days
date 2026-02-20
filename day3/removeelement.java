package day3;

public class removeelement {
    public static void main(String[] args) {

        int arr[] = {3,2,2,3};
        int val = 3;

        int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println("New Length: " + j);

        for(int i = 0; i < j; i++){
            System.out.print(arr[i] + " ");
        }
    }
}