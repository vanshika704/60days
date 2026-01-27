import java.util.Arrays;

public class productofarrayexceptself {
    public static void main(String[] args) {
        int arr[] = new int []{1,2,3,4,5};
        int result []=  new int [arr.length];
        result[0]= 1;
        for(int i  = 1 ; i < arr.length ; i++){
result[i]= arr[i-1]*result[i-1];
        }
        int rightProduct = 1;
         for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }
System.out.println(Arrays.toString(result));
    }
}
