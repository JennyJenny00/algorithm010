import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("before ");
        for (int i : nums) {
            System.out.print(i+ "-");
        }
        System.out.println("\n afer deduplication, the length is :" + removeDuplicates(nums));
        System.out.println("the array lools like this :  ");
        for (int i : nums) {
            System.out.print(i+ "-");
        }
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}