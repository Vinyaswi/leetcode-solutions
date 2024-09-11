class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int nums3[]=new int[c];
        System.arraycopy(nums1,0,nums3,0,a);
        System.arraycopy(nums2,0,nums3,a,b);
        Arrays.sort(nums3);
        if(c%2!=0){
            return Math.floor(nums3[c/2]);
        }
        else{
            return (double)(nums3[c/2]+nums3[(c/2)-1])/2;
        }

        
    }
}