class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0 , end = s.length() -1 ;
        while (start < end){
            while(start < end && !isVowel(chars[start])) start++;
            while(start < end && !isVowel(chars[end])) end--;

            // swap
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }

     boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}