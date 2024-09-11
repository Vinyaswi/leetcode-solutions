class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 &&nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j!=i+1 && nums[j-1]==nums[j]) continue;
                for(int k=j+1;k<nums.length;k++){
                    if(k!=j+1 && nums[k]==nums[k-1]) continue;
                    for(int l=k+1;l<nums.length;l++){
                        if(l!=k+1 && nums[l]==nums[l-1]) continue;
                        long ans=(long)nums[i]+nums[j]+nums[k]+nums[l];
                        if(ans==target){
                            result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }

                }
                
            }
        }
        return result;
        
    }
}