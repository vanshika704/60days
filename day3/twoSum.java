package day3;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {

        int arr[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            int needed = target - arr[i];

            if(mpp.containsKey(needed)){
                System.out.println("Indices: " + mpp.get(needed) + " " + i);
                return;
            }

            mpp.put(arr[i], i);
        }

        System.out.println("No solution found");
    }
}