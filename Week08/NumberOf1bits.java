public class NumberOf1bits {
    public int hammingWeightI(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n&(n - 1);
        }
        return count;
    }
    public int hammingWeightII(int n) {
        int count = 0;
        while (n != 0) {
            count += n&1;
            n = n>>>1;
        }
        return count;
    }
}