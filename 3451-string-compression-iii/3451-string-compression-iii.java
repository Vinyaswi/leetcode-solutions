class Solution {
    public String compressedString(String word) {
        int n=word.length();
        int count=1;
        StringBuilder comp=new StringBuilder();
        char ch=word.charAt(0);
        for(int i=1;i<n;i++){
            if(word.charAt(i)==ch&&count<9){
                count++;
            }
            else{
                comp.append(count).append(ch);
                ch=word.charAt(i);
                count=1;
        }
        }
       comp.append(count).append(ch);
       return comp.toString(); 
    }
}