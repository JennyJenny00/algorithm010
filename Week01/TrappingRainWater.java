import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("the height elevation map is ");
        for (int i : h) {
            System.out.print(i + "-");
        }
        System.out.println("\n Trapping water is " + trap(h));
    }
    public static int trap(int[] height) {
        /*
        Keep track of the maximum height from both forward directions backward directions, 
        call them leftmax and rightmax.
        */
        int left = 0;
        int right = height.length - 1;
        int maxTrap = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                maxTrap += (leftMax - height[left]);
                left++;
            } else {
                maxTrap += (rightMax - height[right]);
                right--;
            }
        }
        return maxTrap;
    }
}