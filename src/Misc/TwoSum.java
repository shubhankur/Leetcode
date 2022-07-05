package Misc;

public class TwoSum {
        public int[] twoSum(int[] numbers, int target) {
            int n = numbers.length;
            for(int i=0,j=n-1;i<n&&j>=0;){
                int sum = numbers[i]+numbers[j];
                if(sum==target) return new int[]{i+1,j+1};
                else if(sum<target) j++;
                else i--;
            }
            return new int[]{0,0};
        }

    public static void main(String[] args) {
    }
}
