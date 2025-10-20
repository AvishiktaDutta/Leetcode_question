class Solution {
    public int singleNumber(int[] nums) {
        int value = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            value = value ^ nums[i];
        }
        return value;
    }
}