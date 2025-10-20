class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int idx_sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            idx_sum = idx_sum + i;
        }
        idx_sum = idx_sum + n;
        return idx_sum - sum;
    }
}