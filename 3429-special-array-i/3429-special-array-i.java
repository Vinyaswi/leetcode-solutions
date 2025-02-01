class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1)
        return true;
      for(int i=0;i<nums.length-1;i++){
        int j=i+1;
            if(nums[i]%2==0 && nums[j]%2==0 || nums[i]%2!=0 && nums[j]%2!=0)
            return false;
        
      }
      return true;
        
    }
}