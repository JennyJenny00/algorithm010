public class Sqrtx {
    public static void main(String[] args) {
        
    }
    public int mySqrt(int x) {
        int left = 1;
       int right = x;
       if (x <= 1) return x;
       while (left <= right) {
           int mid = left + (right - left)/2;
           if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
               return mid;
           }
           if (mid < x / mid) {
               left = mid + 1;
           } else if (mid > x/ mid) {
               right = mid - 1;
           }
       }
       return left;
   }
}