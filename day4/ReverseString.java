package day4;

public class ReverseString {
    public static String brute(String s ){
        String ans = "";
        for(int i = s.length()-1; i >=0 ; i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static String better (String s){
       StringBuilder ans = new StringBuilder(s);

        return ans.reverse().toString();
    }
    public static String optimal (String s ){
        char[] arr = s.toCharArray();
int left  =0 ; int right  =arr.length-1 ; 
while(left<right){
    char temp = arr[left];
    arr[left]= arr[right];
    arr[right]=temp;
    left++;
    right--;
}
return new String(arr);
    } 
    public static void main(String[] args) {
        String str = new String("akihsnav");
      System.out.println(brute(str));  
     System.out.println(better(str));
  System.out.println(optimal(str));
    }
}

