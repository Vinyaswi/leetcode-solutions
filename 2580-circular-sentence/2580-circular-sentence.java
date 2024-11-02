class Solution {
    public boolean isCircularSentence(String sentence) {
        String newSentence=sentence.trim();
       String[] words=newSentence.split(" ");
       int n=words.length;
       if(words.length==1){
        if(words[0].charAt(0)!=words[0].charAt(words.length-1)) return false;

       }
       for(int i=0;i<n-1;i++){
        
        if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)) return false;
       }
       int s=words[n-1].length();
       if(words[0].charAt(0)!=words[n-1].charAt(s-1)) return false;
       return true;

    }
}