class Solution {
    public int getMinCount(int[] freq){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i<26; i++){
            if(freq[i]!=0){
                minValue = Math.min(minValue,freq[i]);
            }
        }
        return minValue;
    }
     public int getMaxCount(int[] freq){
        int maxValue = 0;
        for(int i = 0; i<26; i++){
                maxValue = Math.max(maxValue,freq[i]);
            }
        return maxValue;
    }
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i<s.length();i++){
             int freq[] = new int[26];
             for(int j = i; j<s.length();j++){
                freq[s.charAt(j)- 'a']++;
                int beauty = getMaxCount(freq) - getMinCount(freq);
                sum += beauty;
             }
        }
        return sum;
    }
}