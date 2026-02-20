package day2;

public class RangeSumQuery {
    public static void main(String[] args) {

        int arr[] = {2,4,1,6,3};
        int n = arr.length;

        // Step 1: Build prefix array
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // Query example
        int L = 1;
        int R = 3;

        int result;

        if(L == 0)
            result = prefix[R];
        else
            result = prefix[R] - prefix[L-1];

        System.out.println("Range Sum: " + result);
    }
}