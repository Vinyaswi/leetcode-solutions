class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int i=0;
        int j=1;
        int ind[] =new int[2];
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
                ind[i]=left+1;
                ind[j]=right+1;
                break;
            }
            else if(numbers[left]+numbers[right]>target) right--;
            else if(numbers[left]+numbers[right]<target){ left++; }
        }
        return ind;
    }
}