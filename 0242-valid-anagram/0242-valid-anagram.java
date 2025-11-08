class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sort_s = s.toCharArray();
        char[] sort_t = t.toCharArray();
        Arrays.sort(sort_s);
        Arrays.sort(sort_t);
        String s1 = new String(sort_s);
        String s2 = new String(sort_t);
        boolean isEquals = s1.equals(s2);
        return isEquals;
    }
}