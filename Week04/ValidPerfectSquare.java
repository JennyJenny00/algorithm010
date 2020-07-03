public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int res = num / mid, remain = num % mid;
            if (res == mid && remain == 0) {
                return true;
            }
            if (res > mid) {
                left = mid + 1;
            } else if (res <= mid) {
                right = mid - 1;
            }
        }
        return false;
    } 
}