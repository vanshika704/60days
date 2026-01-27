

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 3, 0, 4, 5, 0, 6};

        int j = 0; // position for non-zero

        // Step 1: move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: fill remaining with zero
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
