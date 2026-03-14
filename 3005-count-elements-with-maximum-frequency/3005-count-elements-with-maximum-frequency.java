class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            int currentFreq = map.getOrDefault(num, 0) + 1;
            map.put(num, currentFreq);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
            }
        }
        int total = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                total += maxFreq;
            }
        }
        return total;
    }
}