public class JumpGame {
    public boolean canJump(int[] nums) {
        //
        // int maxDis = 0;
        // for (int i = 0; i <= maxDis; i++) {
        //     maxDis = Math.max(maxDis, nums[i] + i);
        //     if (maxDis >= nums.length - 1)
        //         return true;
        // }
        // return false;
        int n = nums.length;
        int last = n-1, i, j;
        for(i = n - 2; i >= 0; i--) {
            if(i + nums[i] >= last)
                last = i;
        }
        return last<=0;
    }
}