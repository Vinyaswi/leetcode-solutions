class Solution {
    public boolean isCircularSentence(String sentence) {
        String newSentence=sentence.trim();
        int n=newSentence.length();
       
            if(newSentence.charAt(0)!=newSentence.charAt(n-1))
            return false;
        
        for(int i=1;i<n-1;i++){
            if(newSentence.charAt(i)==' '){
                if(newSentence.charAt(i-1)!=newSentence.charAt(i+1)) return false;
            }

        }
        return true;

    }
}