package Misc;

import java.util.Arrays;

public class IntersectArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n;
        if(nums1.length<nums2.length){
            n = nums1.length;
        }
        else{
            n = nums2.length;
        }
        int[] result = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                result[k++] = nums1[i];
                i++;j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[] result2 = new int[k];
        for(int l=0;l<k;l++){
            result2[l]=result[l];
        }
        return result2;
    }
}
