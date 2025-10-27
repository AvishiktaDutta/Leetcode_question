class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new  HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            int req = target - nums[i];
            if(hm.containsKey(req)){
                int arr[] = {hm.get(req) , i};
                return arr;
            }
            else{
                hm.put(nums[i] , i);
            }
        }
         return null;
    }
}