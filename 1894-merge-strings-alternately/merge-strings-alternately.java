class Solution {
    public String mergeAlternately(String word1, String word2) {
       int size =(word1.length() >= word2.length()) ? word1.length() : word2.length(); 
       String res="";
       for (int i =0 ; i < size ; i++){
            if(word1.length() > i) {
                res += word1.charAt(i);
            }
            if(word2.length() > i) {
                res += word2.charAt(i);
            }
       }
       return res;
    }
}