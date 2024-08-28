class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1 ; i >= 0 ; i--){
            if(!words[i].isEmpty())
            res.append(words[i].trim()+" ");
        }
        return res.toString().trim();
    }
}