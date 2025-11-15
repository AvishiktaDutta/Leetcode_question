class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int j = 0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
               result.add(nums2[j]);
               set.remove(nums2[j]);
            }
        }
        int arr[] = new int[result.size()];
          for(int k = 0; k<result.size(); k++){
            arr[k] = result.get(k);
          }

        return arr;
    }
}