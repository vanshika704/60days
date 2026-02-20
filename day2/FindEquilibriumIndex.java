package day2;

public class FindEquilibriumIndex {
    public static void main(String[] args) {

        int arr[] = {1,3,5,2,2};
        int n = arr.length;

        int totalSum = 0;
        for(int num : arr){
            totalSum += num;
        }

        int leftSum = 0;

        for(int i = 0; i < n; i++){

            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum){
                System.out.println("Equilibrium Index: " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Equilibrium Index Found");
    }
}