import java.util.*;
import java.io.*;
class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(map.containsKey(nums[i]*nums[j]))
                {
                    map.put(nums[i]*nums[j],map.get(nums[i]*nums[j])+1);
                }
                else
                {
                    map.put(nums[i]*nums[j],1);
                }
            }
        }
        Collection<Integer> values = map.values();
        int count=0;
        for (Integer value : values) {
            if(value>1)
            count+=(value*(value-1))/2;
    }
    return count*8;
    }
}