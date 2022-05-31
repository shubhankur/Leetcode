package Misc;
import java.util.Arrays;

public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max = Math.max(sum,max);
            if(sum<0) sum=0;
        }
        max = max==0?Arrays.stream(nums).max().getAsInt():max;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-9,-2,1,8,7,-6,4,9,-9,-5,0,5,-2,5,9,7},0));
    }
}
