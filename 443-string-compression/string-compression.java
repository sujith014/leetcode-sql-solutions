class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for(int i = 0 ;i < chars.length ;i++){
            int count = 1;
            char ch = chars[i] ;
            while( i < chars.length -1 && chars[i+1] == ch){
                count++;
                i++;
            }
            chars[index++] = ch;
            if(count > 1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[index++] = c;
                }
            }
            
        }
        return index;
    }
}



// class Solution {
//     public int compress(char[] chars) {
//         StringBuilder s = new StringBuilder();
//         for(int i = 0 ;i < chars.length ;i++){
//             int count = 1;
//             char ch = chars[i] ;
//             while( i < chars.length -1 && chars[i+1] == ch){
//                 count++;
//                 i++;
//             }
//             s.append(chars[i]);
//             if(count > 1)
//                 s.append(count);
            
//         }
//         return s.toString().length();
//     }
// }