
package Misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUnsorted {
        public int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i =0;i<numbers.length;i++){
                if(map.containsKey(target-numbers[i]) && map.get(target-numbers[i])!=i){
                    return new int[]{i,map.get(target-numbers[i])};
                }
                map.put(numbers[i],i);
            }
            return new int[]{0,0};
        }

    public static void main(String[] args) {
    }
}
