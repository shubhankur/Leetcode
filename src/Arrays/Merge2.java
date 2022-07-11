package Arrays;

class Merge2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index]= nums1[i];
                i--;
            }
            else{
                nums1[index]= nums2[j];
                j--;
            }
            index--;
        }
        while (j>=0){
            nums1[index--]= nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{0,2,5,6};
        merge(nums1,3,nums2,3);

        for (int n:
             nums1) {
            System.out.println(n);
        }
    }
}