class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        String s2 = s.trim();
        int i = s2.length()-1;
        while(i >= 0 && s2.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}