class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int l=0;
        int r=0;
        int maxlen=0;
        int n=s.length();

        while(r<n){
            if(hash.containsKey(s.charAt(r))){
                if(hash.get(s.charAt(r))>=l){
                    l=hash.get(s.charAt(r))+1;
                }
            }
            maxlen=Math.max(maxlen,r-l+1);
            hash.put(s.charAt(r),r);
            r++;
        }
      return maxlen;  
    }
}