package Arrays;

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        List list = new ArrayList();
        Set set = new HashSet();
        for (int n:
             nums) {
            list.add(n);
            set.add(n);
        }
        Set set2 = new HashSet(list);
        Set set3 = new HashSet<>();
        set3.addAll(list);
        if(set.size()<nums.length) return true;
        int i=0;
        for(;i<10;i++){

        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        containsDuplicate(arr);
    }
}
