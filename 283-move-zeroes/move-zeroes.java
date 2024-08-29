class Solution {
    public void moveZeroes(int[] nums) {
        int countZeroes = 0;
        for(int i=0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                countZeroes++;
            }else {
                nums[i-countZeroes] = nums[i]; //  non - zero number
                if(countZeroes > 0)
                    nums[i] = 0 ;
            }
            
        }
    }
}