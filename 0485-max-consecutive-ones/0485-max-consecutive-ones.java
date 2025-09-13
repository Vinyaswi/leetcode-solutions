class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<nums.length){
            if(nums[r]==0) l=r+1;
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}