public class ReverseBits {
    public int reverseBitsI(int n) {
        //移位
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            if ((n&1) == 1) {
                res ++;
            }
            n >>= 1;
        }
        return res;
    }
    public class Solution {
        // you need treat n as an unsigned value
        public int reverseBitsII(int n) {
            int left = 0;
            int right = 31;
            while (left < right) {
                n = reversePairs(n, left, right);
                left ++;
                right --;
            }
            return n;
        }
        private int reversePairs(int n, int left, int right) {
            int left_bit = ((n >> right) & 1);
            int right_bit = ((n >> left) & 1);
            if (left_bit != right_bit) {
                //bit mask 是(1 << left) | (1 << right)
                //把左右两位都设为1， 然后再和自己异或，相同得0，不同得1 就取反了。原来是1 变成0， 原来是0 变成1
                x ^= ((1 << left) | (1 << right));
            }
            return x;
        }
        
    }

}