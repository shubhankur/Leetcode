package Misc;
import java.util.Arrays;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums, int k) {
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        return maxSubarray;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-9,-2,1,8,7,-6,4,9,-9,-5,0,5,-2,5,9,7},0));
    }
}
