import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int moreNeeded = target - arr[i];

            if (mpp.containsKey(moreNeeded)) {
                System.out.println("Indices: " + mpp.get(moreNeeded) + ", " + i);
                return;
            }

            mpp.put(arr[i], i);
        }
    }
}
