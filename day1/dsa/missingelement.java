public class missingelement {
    public static void main(String[] args) {
        int xor = 0 ; int nums[] = new int []{3,0,1};

        for(int i = 0 ; i  < nums.length ; i++){
            xor ^= i ^ nums[i];
        }
   System.out.println(xor ^ nums.length); 
    }
}
