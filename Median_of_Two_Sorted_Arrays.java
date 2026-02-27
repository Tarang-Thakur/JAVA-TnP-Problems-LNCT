import java.util.Arrays;

class Median_of_Two_Sorted_Arrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] num = new int[l];
        for (int i=0; i<nums1.length; i++){
            num[i] = nums1[i];
        }
        for (int i=0; i<nums2.length; i++){
            num[i+nums1.length] = nums2[i];
        }
        Arrays.sort(num);
        int div = l/2;
        if (l%2 == 0){
            int res = num[div-1] + num[div];
            double fres = res/2.0; 
            return fres;
        }
        else if (l%2 != 0){
            return num[div];
        }
        else{
            return 0;
        }
    }
}