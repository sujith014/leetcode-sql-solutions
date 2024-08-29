class Solution {
    public void moveZeroes(int[] nums) {
        int countZeroes = 0;
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                countZeroes++;
            }else {
                    int temp = nums[i]; //  non - zero number
                    nums[i] = 0 ;
                    nums[i-countZeroes] = temp ;
            }
            
        }
   
    }
}