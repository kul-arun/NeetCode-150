// https://leetcode.com/problems/valid-anagram/

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[27];
        for (int i=0; i < s.length(); ++i) {
            ++counts[s.charAt(i) % 32];
        }
        for (int i=0; i < t.length(); ++i) {
            --counts[t.charAt(i) % 32];
        }
        for (int n : counts) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
}
