class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int min_height;
        int left_max=0;
        int right_max=height.length-1;
        for(int i=0;i<height.length;i++){
            if(height[left_max]<height[right_max]){
                min_height=height[left_max];
            }
            else{
                min_height=height[right_max];
            }
            if(max<((right_max-left_max)*min_height)){
                max=(right_max-left_max)*min_height;
            }
            else{
                max=max;
            }
            if(height[left_max]<height[right_max]){
                left_max+=1;
            }
            else{
                right_max--;
            }
        }
        return max;
        
    }
}