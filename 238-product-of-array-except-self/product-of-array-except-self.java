// T.c = 0(N) , S.c = 0(N)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
         int pro =1 ;
        for(int i =0 ; i < size ; i++){
            res[i] = pro ;
            pro *= nums[i]; 
        }
        pro =1 ;
        for(int i =size -1 ; i >= 0 ; i--){
            res[i] *= pro ;
            pro *= nums[i]; 
        }
        return res;
    }
}


// T.c = 0(N^2) , S.c = 0(N)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] res = new int[nums.length];
//         for(int i =0 ; i < nums.length ; i++){
//             int num =1 ;
//             for(int j = 0 ; j < nums.length ; j++){
//                 if(i!=j)
//                 num *= nums[j]; 
//             }
//             res[i] = num;
//         }
//         return res;
//     }
// }

