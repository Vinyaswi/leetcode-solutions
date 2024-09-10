class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int c=Integer.MAX_VALUE/2;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<Math.abs(c-target)){
                        c=sum;
                    }
                    
                }
            }
            
        }
       
       return c; 
    }
}