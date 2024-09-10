// https://leetcode.com/problems/product-of-array-except-self/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int prefixProduct = 1;
        for (int i=0; i < ans.length; ++i) {
            ans[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        
        int postfixProduct = 1;
        for (int i=ans.length-1; i >= 0; --i) {
            ans[i] *= postfixProduct;
            postfixProduct *= nums[i];
        }
        
        return ans;
    }
}
