class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                pq.offer((long)nums[i]);
            }
        }
        while(pq.size()>1 && pq.peek()<k){
            long x=pq.poll();
            long y=pq.poll();
            long val=Math.min(x,y)*2+Math.max(x,y);
            if(val<k){
                pq.offer(val);
            }
            count++;

        }
        for(long j=0;j<pq.size();j++){
            long num=pq.poll();
            if(num<k) count++;
        }
        return count;
    }
}