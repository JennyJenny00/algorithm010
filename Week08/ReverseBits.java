public class ReverseBits {
    public int reverseBits(int n) {
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
}