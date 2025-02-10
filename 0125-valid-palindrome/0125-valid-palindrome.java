import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c>='0' && c<='9') {
                sb.append(c);
            }
        }
    
        int left=0;
        int right=sb.length()-1;
        while(left<right){
            if(sb.charAt(left)!=sb.charAt(right)) return false;
            left++;
            right--;
        } 
        return true;    
    }
}