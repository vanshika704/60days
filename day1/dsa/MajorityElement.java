public class MajorityElement {
    public static void main(String args[]){
       int[] arr = {1, 2, 3, 2, 4, 5, 6};

        int count = 0  ; int candidate  = 0 ;
        for(int num : arr){
 if(count == 0 ){
            candidate = num;
            count=1;
        }
        else if(candidate == num){
            count++;
        }else{count--;}
        }
         System.out.println("Candidate: " + candidate); 
    }
}
