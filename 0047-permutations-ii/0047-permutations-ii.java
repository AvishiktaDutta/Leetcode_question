class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        Backtrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }
    public void Backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums, boolean[] used){
        if(tempList.size() == nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
             used[i] = true;
             tempList.add(nums[i]);
             Backtrack(resultList, tempList, nums, used);
             used[i] = false;
             tempList.remove(tempList.size()-1);
        }

    }
}