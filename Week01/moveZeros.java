import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        int[] num = {0,1, 0,3,12};
        System.out.println("before ");
        for (int i : num) {
            System.out.print(i);
        }
        moveZeroes(num);
        System.out.println("\n after ");
        for (int i : num) {
            System.out.print(i);
        }
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                nums[i] = 0;
                }
                j++;
            }        
        }
    }
}