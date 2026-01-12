class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];
        int pIndex = 0;
        int nIndex = 1;

        for(int i = 0; i<n; i++){
            if(nums[i] >= 0){
                result[pIndex] = nums[i];
                pIndex += 2;
            }
            else{
                result[nIndex] = nums[i];
                nIndex += 2;
            }
        }
        return result;

    }
}