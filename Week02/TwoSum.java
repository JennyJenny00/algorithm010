import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println("Given array is : \n");
        for (int i : nums) {
            System.out.print(i + "_");
        }
        System.out.println("and the target is : 9 ");
        int[] res = twoSum(nums, 9);
        System.out.println("the result is ");
        for (int i : res) {
            System.out.print(i + "_");
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