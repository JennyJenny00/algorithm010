public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        //先找到断点， 再根据断点调整一下left 和right
        if (nums == null || nums.length == 0) return -1;
        int minIndex = findMin(nums);
        if (target == nums[minIndex]) return minIndex;
        int l = nums.length - 1;
        int left = 0;
        if (target <= nums[l]) left = minIndex;
        int right = l;
        if (target > nums[l]) right = minIndex;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            //在left---mid中间有断点
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) left = mid + 1;
            else right = mid -1;
        }
        return -1;
    }
    public int findMin(int[] nums) {
    int start = 0, end = nums.length - 1;
    while (start < end) {
        int mid = start + (end -  start) / 2;
        if (nums[mid] > nums[end]) start = mid + 1;
        else end = mid;
    }
	return start;
    }
}