class Solution {
    public void sortColors(int[] nums) {
        int count_zero = 0, count_one = 0, count_two = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count_zero += 1; 
            }
            if(nums[i] == 1){
                count_one += 1; 
            }
            if(nums[i] == 2){
                count_two += 1; 
            }
        }
        for(int i = 0; i < count_zero; i++){
           int temp = nums[i];
           nums[i] = 0; 
        }
        for(int i = count_zero; i < (count_zero + count_one) ; i++){
           int temp = nums[i];
           nums[i] = 1; 
        }
        for(int i = (count_zero + count_one); i < nums.length ; i++){
           int temp = nums[i];
           nums[i] = 2;
        } 
    }
}