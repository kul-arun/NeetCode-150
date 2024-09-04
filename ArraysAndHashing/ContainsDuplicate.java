// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integers> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
