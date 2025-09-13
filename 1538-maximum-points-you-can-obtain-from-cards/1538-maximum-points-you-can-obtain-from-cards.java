class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;
        int n= cardPoints.length;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        int r=n-1;
        for(int j=k-1;j>=0;j--){
            lsum-=cardPoints[j];
            rsum+=cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
        
    }
}