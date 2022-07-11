package Arrays;

import java.util.Arrays;

class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int n1=0,n2=0;
        for(int i=0;i<m+n;i++){
            if(n1==m){
                for(int k=n2;k<n;k++){
                    nums3[i++]=nums2[k];
                }
                break;
            }
            if(n2==n){
                for(int k=n1;k<m;k++){
                    nums3[i++]=nums1[k];
                }
                break;
            }
            if(nums1[n1]<=nums2[n2]) {
                nums3[i]=nums1[n1++];
            }
            else {
                nums3[i]=nums2[n2++];
            }
        }
        for (int i =0;i<m+n;i++){
            nums1[i]=nums3[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);

        for (int n:
             nums1) {
            System.out.println(n);
        }
    }
}