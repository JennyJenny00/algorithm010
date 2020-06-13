import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        System.out.println("before and k = 3");
        for (int i : num) {
            System.out.print(i);
        }
        rotate(num, 3);
        System.out.println("\n after ");
        for (int i : num) {
            System.out.print(i);
        }
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length - 1);

    }
    private static void reverse(int[] n, int s, int e) {
        while (s < e) {
            int tmp = n[s];
            n[s] = n[e];
            n[e] = tmp;
            s++;
            e--;
        }
    }
}