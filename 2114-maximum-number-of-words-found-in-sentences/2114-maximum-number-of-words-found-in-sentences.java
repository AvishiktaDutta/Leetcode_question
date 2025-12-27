class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0; i<sentences.length; i++){
           String[] words = sentences[i].split(" ");
                maxCount = Math.max(maxCount, words.length);
            }
        return maxCount;
    }
}