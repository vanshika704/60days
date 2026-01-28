package day2.dsa;

public class removeduplicates {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,3,4,5,6};
        int writepos = 0 ;
        for(int i =1 ; i < arr.length ; i++){
            if(arr[i]!=arr[writepos]){
                writepos++;
                arr[writepos]=arr[i];
            }
           
        }
         for(int i = 0 ; i <=writepos ; i++){
System.out.print(arr[i]);
            }
    }
}
