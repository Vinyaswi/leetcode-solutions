class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
       StringBuilder s1=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s1.toString().equals(goal)) return true;
            char temp=s1.charAt(0);
            s1.deleteCharAt(0);
            s1.append(temp);
            
            
        }
        return false;
    }
}