package day2;

public class Missingnumber {
    public static void brute(String[] args) {

        int arr[] = {3,0,1};
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
    public static void main(String[] args) {

        int arr[] = {3,0,1};
        int n = arr.length;

        int xor1 = 0;  // XOR 0 to n
        int xor2 = 0;  // XOR array

        for(int i = 0; i <= n; i++){
            xor1 ^= i;
        }

        for(int num : arr){
            xor2 ^= num;
        }

        System.out.println("Missing number: " + (xor1 ^ xor2));
    }
}