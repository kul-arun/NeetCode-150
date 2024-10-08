// https://leetcode.com/problems/reverse-bits/

public class ReverseBits {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i=31; i>=0; --i) {
            ans |= (n&1)<<i;
            n >>>= 1;
        }
        return ans;
    }
}
