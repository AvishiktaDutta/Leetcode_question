class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currCount = 0;
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            currCount += nums[i];
            maxCount = Math.max(currCount,maxCount);
            if(currCount < 0){
                currCount = 0;
            }
        }
        return maxCount;
    }
}