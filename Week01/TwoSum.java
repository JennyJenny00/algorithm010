import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] num = {1,2,3,-4,5,-6,7};
        System.out.println("before and k = 4");
        for (int i : num) {
            System.out.print(i + "_");
        }
        int[] nums = twoSum(num, 4);
        System.out.println("\n Result: ");
        for (int i : nums) {
            System.out.print(i+ "_");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}