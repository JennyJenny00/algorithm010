public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        //跟之前一个题一样的。。binary search
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            //4 5 6 1 2
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}